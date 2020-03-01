package com.yx.course01

import java.io.File
import ImpilteApp._
object test  extends  App {
//
//  val file = new File("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt")
//  println(file.yxread)
//  val yy = new Man("PS")
//  yy.fly

  def getimpi(implicit name:String): Unit ={
    println(name+"~~~~~~~~~")
    }
  implicit val tt = "yangxu"

  getimpi

}

  class SupperFile(val file: File) {
    def yxread {
      println("SupperFile")
      scala.io.Source.fromFile(file.getPath).mkString
    }

  }

  class Man(val name:String) {
    def eat: Unit =
    {
      println(s"$name this is a man ,esting")
    }

  }

  class  Superman(val name:String) {
    def fly: Unit = {
      println(s"$name this is a supper man,can fly")
    }


}
