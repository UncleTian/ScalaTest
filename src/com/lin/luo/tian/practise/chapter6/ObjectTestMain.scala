package com.lin.luo.tian.practise.chapter6

object ObjectTestMain {
  def main(args: Array[String]): Unit = {
    exe5
    printUnit("gogogogo")
  }

  def exe1 = {
    println(Accounts.newUniqueNumber())
    println(Accounts.newUniqueNumber())
  }

  def exe2 = {
    var account = Account(1, 10000.0)
    println(account.queryBalance)
  }

  def exe3 = {
    println(TrafficLightColor.Red.id + ":" + TrafficLightColor.Red)
    println(TrafficLightColor.Yellow.id + ":" + TrafficLightColor.Yellow)
    println(TrafficLightColor.Green.id + ":" + TrafficLightColor.Green)
  }

//  def exe4 = {
//    var son = new Son
//    son.assignName
//  }

  def exe5 = {
    var ant = new Ant
    println(ant.env.length)
  }

  def printUnit(x : Unit) {println(x)}
}
