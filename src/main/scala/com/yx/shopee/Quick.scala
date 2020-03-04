package com.yx.shopee

object Quick {
  def main(args: Array[String]): Unit = {

    val arr = List(9,8,7,1,2,3,4,5,6)
    println("排序前的数组：" + arr.mkString("[", ", ", "]"))
    val ret = quickSort(arr)
    println("排序后的数组结果：" + ret.mkString("[", ", ", "]"))

  }
  /**
    * 在scala的集合中有一个方法能够将集合分成两半，可以存储满足条件的数据
    * partition--->分区
    * 一般的基准元素就是每次进行排序的第一个元素。
    *
    */
  def   quickSort(arr: List[Int]):List[Int]  ={
    arr match {
      case Nil => Nil //若列表为空则返回空列表
      case head :: tail => //若不为空
      val (left, right) = tail.partition(_ < head)//见最下方解析“注1”
      quickSort(left) ::: head :: quickSort(right)//左右两边分别递归调用quickSort方法，并且与head进行拼接。详见“注2”

    }
  }

}
