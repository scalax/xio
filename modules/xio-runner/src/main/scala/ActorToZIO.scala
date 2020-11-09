package xio.akka.runner

import akka.actor.typed._
import zio._

import scala.concurrent.{Promise => SPromise}

object ActorToZIO {
  sealed trait QueueReceive
  final case class InputZIO(zio: ZIO[Any, Throwable, Any], replyTo: SPromise[Any]) extends QueueReceive
  final case class ReceiveZIOAction(from: ZIO[ZEnv, Throwable, InputZIO] => Unit)  extends QueueReceive

  def fromActorRef(replyTo: ActorRef[ReceiveZIOAction]): CancelableFuture[Int] = {
    def forZIO: ZIO[ZEnv, Throwable, Int] = {
      val ii = ZIO.effectAsync[ZEnv, Throwable, InputZIO](result => replyTo ! ReceiveZIOAction(result))
      for {
        inner   <- ii
        result1 <- forZIO.fork
        result2 <- inner.zio.either.fork
        result3 <- result2.join
        _ = result3.fold(inner.replyTo.tryFailure, inner.replyTo.trySuccess)
        _ <- result1.join
      } yield 2
    }

    Runtime.default.unsafeRunToFuture(forZIO)
  }

}
