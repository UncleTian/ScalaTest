package com.lin.luo.tian.practise.chapter5

class Employee(val name : String, var salary : Double) {
  def this() {this("John Q. Public", 0.0)}

  override def toString: String = name + ":" + salary
}
