package com.yx.Source

object TEST1  extends  App {
  val arr = Array(3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48 )
  println(arr(0))
  var count=0
  for (i <- 1 to arr.length-1 ){
    var flag = true
    for(y<- 0 to arr.length-1-i )
      {
        if(arr(y)> arr(y+1))
          {
            var tmp=arr(y)
            arr(y)=arr(y+1)
            arr(y+1)=tmp
            flag = false
          }
        count=count+1
      }
    if(flag)
      1
  }
arr.foreach(println)
  println(count)
}
