package com.yx.course

object Test03 extends App {

  val list = List("1","2","3","4","5")
  val l=List(1,2,3)
  println(l.reduceRight(_-_))
  val txt = scala.io.Source.fromFile("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt","UTF-8")
  txt.flatMap(_.toString).map(x => (x,1))


}
