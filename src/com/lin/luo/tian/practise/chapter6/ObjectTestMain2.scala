package com.lin.luo.tian.practise.chapter6

object ObjectTestMain2 extends App {
  if(args.length > 0) {
    println("Has argument : ")
    for (elem <- args) {println(elem)}
  } else {
    println("No argument")
  }
}
