package com.lin.luo.tian.practise.chapter5

class Time(var hours: Int = 0, var minutes: Int = 0) {
  def before(other: Time): Boolean = {
    if (hours == other.hours) {
      minutes < other.minutes
    } else {
      hours < other.hours
    }
  }

}
