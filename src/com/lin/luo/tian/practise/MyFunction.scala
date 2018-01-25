package com.lin.luo.tian.practise
import math.pow

class MyFunction {
  def numJudege(num: Int): Int = {
    if (num < 0) -1
    else if (num == 0) 0
    else 1
  }

  def countdown(n: Int) : Unit = {
    for (i <- n.to(0, -1)) print(i + "\t")
  }

  def product(str: String) : Long = {
    var res : Long = 1
    for(i <- 0 until(str.length)) res = res * str(i)
    res
  }

  def  product2(str: String) : Long = {
    var res : Long = 1
    str.foreach(res *= _.toLong)
    res
  }

  def product3(str : String) : Long = {
    if (str.length == 0) 1L
    else str.head * product3(str.tail)
  }

  def myPow(x : Double, n : Integer) : Double = {
    if (n == 0) 1
    else if (n > 0 && n % 2 == 0)  pow(x, n/2)
    else if (n > 0 && n % 2 == 1) pow(x, n/1)
    else 1/pow(x, -n/1)
  }
}
