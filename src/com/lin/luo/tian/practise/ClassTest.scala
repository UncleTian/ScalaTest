package com.lin.luo.tian.practise

import com.lin.luo.tian.practise.domain.{Man, Person}

object ClassTest {
  def main(args: Array[String]): Unit = {
    var p = new Person
    p.age = 10
    println(p.age)

    p.age = 9
    println(p.age)

    p.age = 15
    println(p.age)

    var man = new Man("tian", 18)
    println(man.description)
  }
}
