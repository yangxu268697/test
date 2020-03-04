package com.yx.shopee

object Max {
  def  max(nums:Array[Int]):Int={
              nums.sorted //排序
        return Math.max(nums(0)*nums(1)*nums(nums.length-1),nums(nums.length-1)*nums(nums.length-2)*nums(nums.length-3))
  }

  def main(args: Array[String]): Unit = {
    val a=Array(-2,-20,8,4,-1,0,3,5,9,12)
    println(max(a))
  }
}
