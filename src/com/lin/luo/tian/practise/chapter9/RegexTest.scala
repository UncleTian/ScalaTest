package com.lin.luo.tian.practise.chapter9

object RegexTest {
  def main(args: Array[String]): Unit = {
    exe2
  }

  def exe2 = {
    val numitemPattern = "([0-9]+) ([a-z]+)".r

    var numitemPattern(num, item) = "99 bottles"

    println(num)
    println(item)

  }

  def exe1 = {
    val numPattern = "[0-9]+".r

    var strs = numPattern.findAllIn("009 helo 854 pls 09u lls")

    strs.foreach((s) => println(s))

    strs.toArray
  }

}
