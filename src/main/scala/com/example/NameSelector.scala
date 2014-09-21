package com.example

import scala.util.Random
import scalax.file.Path

import scala.collection.mutable.ListBuffer
import scala.io.Source
import scopt.OptionParser

object NameSelector {

  def main(args: Array[String]): Unit = parser.parse(args, Config()).map{ conf =>
    val file = conf.file
    val names: List[String] = if (file.isEmpty) readFromStdin() else namesFromFile(file)

    val result = Random.shuffle(names).head
    println()
    println(result)
  }

  /**
   * 引数で渡されたパスにあるファイルから名前のリストを取得する
   * @param path
   * @return
   */
  def namesFromFile(path: String):List[String] = Path.fromString(path).lines().toList

  /**
   * 標準入力から名前のリストを取得する
   * 入力のない空行があったり、crtl+dが入力されると処理を終了して名前のリストを返す
   * @return
   */
  def readFromStdin(): List[String] = {
    import scala.util.control.Breaks._

    val nameBuffer = new ListBuffer[String]
    val stdin = Source.stdin

    try{
      println("input names.")
      print(">")
      breakable{
        for(line <- stdin.getLines()) {
          if (line == "") break // 空文字列であれば処理を抜ける
          print(">")
          nameBuffer += line
        }
      }
    } finally {
      stdin.close()
    }
    nameBuffer.toList
  }

  lazy val parser = new OptionParser[Config]("NameSelector") {
    head("NameSelector", "1.0")
    opt[String]('f', "file") action { (input, config) =>
      config.copy(file = input)} text ("file is a path to a file that written participant's names.")
    help("help") text("print this message.")
  }

  case class Config(file: String = "")

}

