package com.yx.Source
import org.apache.hadoop.hdfs.server.common.JspHelper.Url

import scala.io.Source
object SourceApp   {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("C:\\Users\\Administrator\\Desktop\\新建文本文档.txt")

    def readline={
      for(line <- file.getLines())
        println(line)
    }
    def readChar: Unit ={
      for(ele <- file)
        println(ele)
    }

    def readUrl(): Unit ={
      val url = Source.fromURL("http://www.bing.com")
      for(line <- url.getLines())
        println(line)
    }
    readUrl
    }






}
