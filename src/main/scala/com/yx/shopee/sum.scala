package com.yx.shopee

object sum {

  def twosum(num:Array[Int],target:Int):Array[Int]={
    val res:Array[Int] = new Array[Int](2)
     for(i <- 0 to num.length-1) {
       for (j <- i to num.length - 1) {
         if (num(j) == target - num(i)) {
           res(0) = i
           res(1) = j
           println(num(i), num(j))
         }
       }
     }
    res
  }

  def main(args: Array[String]): Unit = {
    val a=Array(1,2,3,4,5,6,7,8,9,10,12,13,14)
   twosum(a,9)

  }
}
