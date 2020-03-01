package com.yx.course

object TEST {


  def main(args: Array[String]): Unit = {
    val list=  Array("yx","lx","czy","hj")
    for(i <-list){
      println(i)

    }
    list.foreach(i =>println(i))
  }


}
