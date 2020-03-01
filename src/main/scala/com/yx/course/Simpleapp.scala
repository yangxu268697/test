package com.yx.course

object Simpleapp {
  def main(args: Array[String]): Unit = {
var person=new Person()
   println(person.age)
    person.name="yangxu"
    println("who "+person.eat())
person.featbool("tv")
  }
  class Person{
    //定义属性
    var name=""
    val age:Int=10
    //定义方法
    def eat():String ={
      name+"is eat"
    }
def featbool(teaMname:String)={
println(name+"is watching"+teaMname)
}
  }
}
