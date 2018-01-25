package com.lin.luo.tian.practise.chapter5

class BankAccount {
  private var balance = 0.0

  def deposit(amount: Double) = {
    balance += amount
  }

  def withdraw(amount: Double) = {
    balance -= amount
  }

  def query = balance
}
