package com.lin.luo.tian.practise

import java.io.File
import java.util
import java.util.Scanner

import scala.collection.JavaConversions.mapAsScalaMap
import scala.collection.mutable

object Practise3 extends App {

  var in = new Scanner(new File("myfile.txt"))
  //exercise6

  var array = Array(1, 2, 3, 4, 5)
  println(minmax(array))

  def minmax(values : Array[Int]) = {
    (values.min, values.max)
  }

  def exercise0(): Unit = {
    val equipements = Map("银鳞胸甲" -> 5, "鸡腿法杖" -> 14, "蛋刀" -> 100)
    val discountEQ = for ((k, v) <- equipements) yield (k, 0.9 * v)

    // println(equipements)
    println(discountEQ)
  }

  def exercise1(in: Scanner): Unit = {
    var charMap = new mutable.HashMap[String, Int]

    while (in.hasNext()) {
      val word = in.next()
      charMap(word) = charMap.getOrElse(word, 0) + 1
    }

    print(charMap)
  }

  def exercise2(in: Scanner): Unit = {
    var charMap = mutable.Map[String, Int]()

    while (in.hasNext()) {
      val word = in.next()
      charMap += (word -> (charMap.getOrElse(word, 0) + 1))
    }

    print(charMap)
  }

  def exercise3(in: Scanner): Unit = {
    var charMap = mutable.SortedMap[String, Int]()

    while (in.hasNext()) {
      val word = in.next()
      charMap += (word -> (charMap.getOrElse(word, 0) + 1))
    }

    print(charMap)
  }

  def exercise4(in: Scanner): Unit = {
    val charMap: scala.collection.mutable.Map[String, Int] = new util.TreeMap[String, Int]

    while (in.hasNext()) {
      val word = in.next()
      charMap += (word -> (charMap.getOrElse(word, 0) + 1))
    }

    print(charMap)
  }

  def exercise5(): Unit = {
    var calendarMap = mutable.LinkedHashMap[String, Int]()
    calendarMap += ("Monday" -> java.util.Calendar.MONDAY)
    calendarMap += ("Tuesday" -> java.util.Calendar.TUESDAY)
    calendarMap += ("Wednesday" -> java.util.Calendar.WEDNESDAY)
    calendarMap += ("Thursday" -> java.util.Calendar.THURSDAY)
    calendarMap += ("Friday" -> java.util.Calendar.FRIDAY)
    calendarMap += ("Saturday" -> java.util.Calendar.SATURDAY)
    calendarMap += ("Sunday" -> java.util.Calendar.SUNDAY)
    print(calendarMap)
  }

  def exercise6(): Unit = {
    var keys = Array("java.runtime.name", "sun.boot.library.path", "java.vm.version", "java.vm.vendor",
      "java.vendor.url", "path.separator", "java.vm.name")
    var keyvaluemap = Map[String, String]()
    for (elem <- keys) keyvaluemap += (elem -> java.lang.System.getProperty(elem))

    var firstLineWidth = keyvaluemap.keySet.max.length + 10
    keyvaluemap.foreach((es) => printf("%-" + firstLineWidth + "s|%s\n", es._1, es._2))

  }

}
