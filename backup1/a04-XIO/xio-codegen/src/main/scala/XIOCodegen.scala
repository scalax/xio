package xio.codegen

import java.io.PrintWriter
import java.nio.file.{Files, Paths}

import scala.util.Using

object XIOCodegen {

  val filePath1 = Paths.get(".", "a04-XIO", "xio-implicit", "src", "main", "scala", "xio", "nat", "has", "XHasProjection.scala")
  val filePath2 = Paths.get(".", "a04-XIO", "xio-implicit", "src", "main", "scala", "xio", "nat", "error", "XErrorProjection.scala")

  def main(i: Array[String]): Unit = {
    Files.createDirectories(filePath1.getParent)
    Using(new PrintWriter(filePath1.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XHasProjection(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }

    Files.createDirectories(filePath2.getParent)
    Using(new PrintWriter(filePath2.toFile, "utf-8")) { writer =>
      val content = StringUtil.trimLines(xio.codegen.txt.XErrorProjection(maxItem = XIOParam.maxItem).body)
      writer.println(content)
    }
  }

}
