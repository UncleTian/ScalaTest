package com.lin.luo.tian.practise.chapter6

class Account private(val id: Int, initialBalance: Double) {
  private var balance = initialBalance

  def queryBalance = balance

}

object Account {
  def apply(id : Int, initialBalance : Double) : Account = {
    new Account(id, initialBalance)
  }
}
