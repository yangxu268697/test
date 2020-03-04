package com.yx.shopee

object Pingfang {
   def Sqrt(num:Int):Int={
     var left=0;
     var right=num;
     if(num==0||num==1)
       {
         return num;
       }
     while (1==1)
       {
         var mid=left+(right-left)/2;//防止溢出
         if(left*left<=num && right*right>=num && (right-left)<=1)
           {
             return mid
           }
         else
           if(mid*mid>num)
           {
             right=mid
           }
         else
           {
             left=mid
           }
       }
    return num
   }

  def main(args: Array[String]): Unit = {
    println(Sqrt(3))
  }
}
