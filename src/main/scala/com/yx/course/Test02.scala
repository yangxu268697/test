package com.yx.course

//import com.yx.course.Test02.name

import scala.util.Random


object Test02 extends App {

  //
  //  val t=
  //    """
  //      |这是多行字符串
  //      |可以输入多行
  //    """.stripMargin
  //  println(t);
  //
  //  val name="yx"
  //  val age = 12
  //  println(s"yy$name$age")

  // val add = (x:Int) =>(x+1)
  //  println(add(11))
  //val names = Array("yangxu","lixue","zhangsan","yy")
  // val name = names(Random.nextInt(names.length))
  //  println(name)
  //  name match {
  //    case "yangxu" =>println("this is :"+name)
  //    case "yy" =>println("this is :"+name)
  //    case _ => println("others")
  //
  //  }

  //  panduan(name,12)

  //  def panduan(name:String,age:Int)= {
  //    name match {
  //      case "yangxu" => println("this is :" + name)
  //      case "yy" if (age == 12) => println(s"this is :$name$age" )
  //      case "yy" => println("this is :" + name)
  //
  //      case _ => println("others")
  //    }
  //  }
  val list = List(4, 2, 3)
  val list2 = list.map((x: Int) => x + 1)
  val list3=  List("1","2","3")
  def tt(list: List[String]) = {
  }
  list.map(x => x*2).foreach(println)
  list.map((x) => x*3).foreach(println)
  list.map(_+2).foreach(println)
  val t = List(1,2,3,4,5,6,7,8,9)

  println(  t.reduce(_+_))
  println(  t.reduceRight(_-_))
  println(  t.reduceLeft(_-_))
//
//val y = tt(list3)
val t1= scala.io.Source.fromFile("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt").mkString
//  println(t)
  val listyx=List(t1)
  val wordPairsRDD = listyx.flatMap(x => x).map(x => (x,1)).foreach(println)
//  val tt = listyx.flatMap(_.split("")).filter(!_.isEmpty).map((_,1)).reduceByKey(_+_).map{case (word,count) =>(count,word)}.sortByKey(false)
//  val tt = {
//    wordPairsRDD.reduceByKey((x, y) => x + y)
//  }
  listyx.flatMap(_.split("、")).foreach(println)




}
