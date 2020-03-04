package com.yx.shopee

object Sqrt {
def sqrt(i:Int):Int ={
  if(i==1||i==0)
    {
      return i;
    }
  var left=0;
  var right=i;
  while(1==1){
    var mid=left+(right-left)/2;
    if(left*left<=i && right*right>=i && (right-left)<=1 )
      return mid
    else
      if(mid*mid>i)
       {
         right=mid
       }
    else
      {
        left=mid
      }
  }
return i
}

  def main(args: Array[String]): Unit = {
    println(sqrt(4))
  }
}
