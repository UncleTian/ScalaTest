package com.lin.luo.tian.practise.chapter6

object Accounts {
  private var lastNumber = 0

  def newUniqueNumber() = {lastNumber += 1; lastNumber}

  def queryBalance = {new Accounts().balance}
}

class Accounts {
  private var balance = 0.0

  def getLastNumber = {Accounts.lastNumber}
}
