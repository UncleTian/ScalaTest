object Decorate extends App {
  println(Util.decorate("Hello"))
  println(Util.decorate("Hello", "<<<", ">>>"))

  println(Util.sum(10,12,13))
  println(Util.sum(1.to(10) : _*))
  println(Util.recursiveSum(1 ,2 ,3, 4, 5))

}
