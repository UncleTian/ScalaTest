package com.lin.luo.tian.practise

object Practise2 extends App {

  override def main(args: Array[String]): Unit = {
    //exercise1
    //exercise2
    exercise3
  }

  def exercise1: Unit = {
    var util = new MyArrayUtil
    println(util.randomArray(10))
  }

  def exercise2: Unit = {
    var util = new MyArrayUtil
    val myArray = Array(1,2,3,4,5)
    myArray.foreach((a) => print(a + "\t"))
    util.revert(myArray)
    println()
    myArray.foreach((a) => print(a + "\t"))
  }

  def exercise3 : Unit = {
    var util = new MyArrayUtil
    val myArray = Array(1,2,3,4,5)
    util.revert2(myArray).foreach((e) => println(e + "\t"))
  }


}
