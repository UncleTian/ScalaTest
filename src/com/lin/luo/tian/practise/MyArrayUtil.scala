package com.lin.luo.tian.practise

import scala.collection.mutable.ArrayBuffer
import scala.util.Random

class MyArrayUtil {
  def randomArray(n : Integer) : ArrayBuffer[Int]= {
    val arrayBuffer = ArrayBuffer[Int]()
    for (i <- 0 to n) {
      arrayBuffer.append(Random.nextInt(n))
    }
    arrayBuffer
  }

  def revert(array: Array[Int]) : Array[Int] = {
    for (i <- 0 until(array.length) if i % 2 == 1) {
      val temp = array(i - 1)
      array(i - 1) = array(i)
      array(i) = temp
    }
    array
  }

  def revert2(array: Array[Int]) :Array[Int] = {
    var ab  = for (i <- 0 until(array.length) if i % 2 == 1) yield array(i -1)
    ab.toArray
  }
}
