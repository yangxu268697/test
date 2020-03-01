package com.yx.shopee

object twof {

    def search(nums: Array[Int], target: Int): Int = {
      var left = 0;
      var right = nums.length - 1;
      while (left <= right) {
        var mid = left + (right - left) / 2;
        if (nums(mid) == target) {
          return mid;
        }
        else if (target < nums(mid)) {
          right = mid - 1;

        }
        else {
          left = mid + 1
        }
      }
      return -1
    }
  def main(args: Array[String]): Unit = {
  val a=Array(-1,0,3,5,9,12);
   search(a,9)
  }
}
