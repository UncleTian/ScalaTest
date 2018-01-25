package com.lin.luo.tian.practise

import java.util

//import scala.collection.JavaConversions._
import scala.collection.JavaConverters._

object MapTest extends App {
  val scores = Map("Jack"->10, "Lucy"->12, "Tom"->23)
  println(scores("Lucy"))

  val ages = scala.collection.mutable.Map("Jack"->10, "Lucy"->12, "Tom"->23)
  ages.put("Cat",26)
  println(ages.size)
  println(ages("Cat"))
  println(ages.getOrElse("Caty", 56))

  var newScores = scores + ("Green"->58, "White"->43)
  println(newScores.size)

  newScores = newScores - "Jack"
  println(newScores)

  println("===============================")
  for ((k, v) <- newScores) println(k + ":" + v)

  println("===============================")
  val values = for ((k, v) <- newScores) yield v
  println(values)

  var javaTreeMap = new util.TreeMap[Integer, String]()
  javaTreeMap.put(1, "hello")
  javaTreeMap.put(2, "world")

  var scalaMap = javaTreeMap.asScala
  println(scalaMap)

  var t = (1, 3.14, "Jessie")
  println(t._1)
  println(t._2)
  println(t._3)

  val city = "New York City".partition(_.isUpper);
  println(city)

  val symbols = Array("<", "-", ">")
  val counts = Array(3, 10, 3)
  val pairs = symbols.zip(counts)
  for ((s, n) <- pairs) Console.print(s * n)

}
