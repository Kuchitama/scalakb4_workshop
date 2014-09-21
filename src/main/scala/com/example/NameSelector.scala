package com.example

import scala.util.Random
import scalax.file.Path

object NameSelector {
  lazy val namesFile:Path = Path("names.txt")
  lazy val names:List[String] = namesFile.lines().toList

  def main(args: Array[String]): Unit = {
    val result = Random.shuffle(names).head
    println(result)
  }
}
