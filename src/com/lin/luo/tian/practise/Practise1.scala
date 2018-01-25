package com.lin.luo.tian.practise

object Practise1 extends App {
  val mf = new MyFunction;
  println(mf.numJudege(-2))
  println(mf.numJudege(0))
  println(mf.numJudege(2))

  var x: Unit = 1
  var y = 1;
  x = y = 1
  println("type:" + (y = 1).getClass.getTypeName)
  println(x)

  //  for (i <- 10.to(0, -1)) {
  //    println(i)
  //  }
  println("-----------------")
  var str = "Hello";
  for (i <- 0 until (str.length)) {print(str(i) + "\t"); print(str(i).toInt + "\n")}
  println(72L*101L*108L*108L*111L)
  println("-------------------------")
  mf.countdown(15)

  println(mf.product("Hello"))

  "Morning".foreach((x : Char) => print(x + "\t"))

  println(mf.product2("Hello"))

  println(mf.product3("Hello"))

  println(mf.myPow(2, 3))
  println(mf.myPow(2, 4))
  println(mf.myPow(2, -4))
  println(mf.myPow(2, 0))
}
