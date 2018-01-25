package com.lin.luo.tian.practise.chapter5

class Counter {
  private var value = 0
  private var bigValue = BigDecimal(Int.MaxValue)

  def increment() {
    if (value == Int.MaxValue) {
      bigValue += 1
    } else {
      value += 1
    }
  }

  def current() = {
    if (value <= Int.MaxValue) {
      value
    } else {
      bigValue
    }
  }

}
