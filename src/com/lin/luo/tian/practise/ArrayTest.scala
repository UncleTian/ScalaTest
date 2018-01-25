package com.lin.luo.tian.practise

import scala.collection.mutable.ArrayBuffer

object ArrayTest extends App {

  override def main(args: Array[String]): Unit = {

    val nums = new Array[Int](10)
    var strArray = Array("Hello", "world", "Tom", "Jerry")
    println(strArray(1))
    strArray(1) = "Dogs"
    println(strArray(1))

    val arrayBuffer = ArrayBuffer[Int]()
    arrayBuffer += 10
    arrayBuffer += 20
    arrayBuffer += 30
    arrayBuffer += 40
    arrayBuffer += 50

    arrayBuffer.foreach((f) => print(f + "\t"))
    arrayBuffer += (99, 98)
    arrayBuffer ++= ArrayBuffer(1, 2, 3)
    println("\n------------------------------------")
    arrayBuffer.foreach((f) => print(f + "\t"))
    arrayBuffer.trimEnd(3)
    println("\n------------------------------------")
    arrayBuffer.foreach((f) => print(f + "\t"))

    println("\n+++++++++++++++++++++++++++")
    for (i <- 0 until(arrayBuffer.length, 2)) print(arrayBuffer(i) + "\t")

    println("\n+++++++++++++++++++++++++++")
    for (i <- (0 until(arrayBuffer.length)).reverse) print(arrayBuffer(i) + "\t")

    println("\n+++++++++++++++++++++++++++")
    for (elm <- arrayBuffer) print(elm + "\t")

    println("\n" + arrayBuffer.sum)
    println(arrayBuffer.max)
    println(arrayBuffer.min)

    printest

    val arrayWithoutOrder = ArrayBuffer(9, 5, 15, 64, 32)
    println(arrayWithoutOrder)
    println(arrayWithoutOrder.sorted)
    println(arrayWithoutOrder.sorted.reverse)
    println(arrayWithoutOrder.mkString(" and "))
  }

  def printest : Unit = {
    println("biubiubiubiu")
  }

}
