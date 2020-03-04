package com.yx.shopee

object Insert {
 def insert(nums: Array[Int], target: Int): Int ={
     for(i <- 0 to nums.length-1)
       {
         while(nums(i)>=target)
           {
             return i
           }
       }
     return nums.length
 }

  def main(args: Array[String]): Unit = {
    val a=Array(-1,0,3,5,9,12)
    println(insert(a,14))
  }
}
