package com.lin.luo.tian.practise.chapter9

 class Person(val name: String, val age: Int) extends Serializable {
  override def toString: String = name + ":" + age
}

object Person {
  def apply(name: String, age: Int): Person = {
    new Person(name, age)
  }
}
