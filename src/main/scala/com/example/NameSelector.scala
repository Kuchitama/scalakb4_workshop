package com.example

import scala.util.Random

object NameSelector {
  lazy val names = List("aa7th", "ryu1_okd", "mumoshu")

  def main(args: Array[String]): Unit = {
    val result = Random.shuffle(names).head
    println(result)
  }
}
