package com.yx.Source

import java.io.FileInputStream

import org.json4s.jackson.Json

import scala.xml.XML

object XmlApp {

  def main(args: Array[String]): Unit = {
    loadxml
  }
  def loadxml: Unit ={
//    val xml= XML.load(this.getClass.getClassLoader.getResource("test.xml"))
//    println(xml)

    val xml = XML.load(new FileInputStream("E:\\cechealth\\scalstest\\src\\main\\resouces\\test.xml"))
//    val to =  xml \ "to"

//    val froms = (xml \\"from").map(_ \"@name")
//val froms = (xml \"from" \\"@name")
//    for( from <- froms)
//    println(from)
    (xml \"from").map(x =>(x.text)).foreach(println)

  }
}
