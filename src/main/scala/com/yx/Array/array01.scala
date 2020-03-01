package com.yx.Array

object array01 extends App {
  val a =Array[String]("YANGXU","LIXUE","WANGYI")
  a(2) = "6666"

  for(i <- a)
    {
      println(i)

    }

//var c=Array(1,2,3,4,5)
//  println(c.sum)
// val d= c.mkString("<",",",">")
//  for(i <- d)
//    print(i)

  /* 这是我的第一个 Scala 程序
   * 以下程序将输出'Hello World!'
   */
  /*zaoshang
  sjdijshio
  djisajdik

   */

  val e = scala.collection.mutable.ArrayBuffer[String]()
 e += "aaa"
  e += "bbb"
  println(e.length)

}
