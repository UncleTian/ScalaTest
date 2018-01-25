package com.lin.luo.tian.practise.chapter5

object Chapter5Test {
  def main(args: Array[String]): Unit = {
    exe5
  }

  def exe1 = {
    var counter = new Counter
    while (true) {
      println(counter.current())
      counter.increment()
      Thread.sleep(1000)
    }
  }

  def exe2 = {
    var bankAccount = new BankAccount
    bankAccount.deposit(100)
    println(bankAccount.query)
    bankAccount.withdraw(10)
    println(bankAccount.query)
  }

  def exe3 = {
    var time1 = new Time(12, 11)
    var time2 = new Time(12, 12)
    println(time1.before(time2))
  }

  def exe4 = {
    var student = new Student("zhangs", 22)
    println(student)
    student.setName("Jack")
    student.setAge(55)
    println(student)
  }

  def exe5 = {
    var employee = new Employee()
    println(employee)

  }
}
