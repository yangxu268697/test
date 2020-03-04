package com.yx.shopee

object Pow {
  def myPow(x: Double, n: Int): Double = {
    var i=x;
    var N=n;
    if(n<0)
      {
        i=1/x;
        N= -n;
      }
    var res:Double=1;
     for(q <- 1 to N)
       {
       res=res*i
       }
    return res
  }

  def main(args: Array[String]): Unit = {
    println(myPow(2,-2))
  }
}
