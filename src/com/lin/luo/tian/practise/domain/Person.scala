package com.lin.luo.tian.practise.domain

class Person {
  private var privateAge = 0

  def age = privateAge

  def age_= (newAge : Int) {
    if(newAge > privateAge) privateAge = newAge
  }

}
