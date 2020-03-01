
package com.yx.course

object Cons {
  def main(args: Array[String]): Unit = {
    val person = new Person("YANGXU",28)
    println(person.age+person.name+person.school)


    val person2 = new Person("lixue",26,"M")
    println(person2.age+person2.name+person2.school+person2.gren)
  }


//主构造器
  class Person(var name:String,val age:Int){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   println("------------")
    val school="sc"
    var gren:String=_
  //附属构造器
    def this(name:String,age:Int,gren:String){
      this(name,age)
      this.gren=gren

    }

  }
}
