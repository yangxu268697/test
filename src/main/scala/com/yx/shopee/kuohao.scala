package com.yx.shopee

import org.apache.spark.{SparkConf, SparkContext}

object kuohao {
  def isValid(s: String): Boolean = {
    var s1="";
    if (s.contains("()")||s.contains("[]")||s.contains("{}")) {
      s1=s.replaceAll("\\(\\)","").replaceAll("\\[\\]","").replaceAll("\\{\\}","");
      if (s1.length==0)
       return  true
     else
       false
    }
    else
      true

  }

  def main(args: Array[String]): Unit = {
    val conf=new SparkConf().setAppName("WordCount").setMaster("local")
    val sc = new SparkContext(conf)
    val list = List("hadoop","spark","hive","spark","yangxu","yangxu","yangxu")
    val rdd = sc.parallelize(list)
    val pairRdd = rdd.map((_,1))
    pairRdd.reduceByKey(_+_).collect.foreach(println)
    sc.stop()
  }
}
