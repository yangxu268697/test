package com.yx.shopee
import scala.collection.immutable.ListMap
import scala.collection.immutable.ListMap
object mapkey {
  def main(args: Array[String]): Unit = {
    val grades = Map( "Kim" -> 90 ,
      "Al" -> 85 ,
      "Melissa" -> 95 ,
      "Emily" -> 91 ,
      "Hannah" -> 92)
    grades.toSeq.sortBy(_._2).foreach(i => println(i))
    grades.toSeq.sortBy(_._1).foreach(j => println(j))
  }


}
