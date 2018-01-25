object Hello extends App {
  println("Hello, World!")
  val str = "big big world"
  val str2 = "abc" + str
  println(str)
  println(str2)

  val x = 1
  val y = if (x > 2) 1
  else if (x == 1) "a" else 'b'

  println(y)

  val kk = 1 + 2 + 3
  +4 + 5

  val jj = 1 + 2 + 3 +
    4 + 5

  println("kk=" + kk)
  println("jj=" + jj)

  println("-------------------------------")

  for (i <- 1 to 10; from = 5 - i; j <- from to 10)
    print(i.toString + j.toString + "\t")

  try {
    val text = scala.io.Source.fromFile("D:\\test_deployment\\storm_cluster_app.properties1").mkString
    println(text)
  } catch {
    case e : Exception => {
//      println(e.getLocalizedMessage)
      println("-------------------------")
      println(e.getMessage)
      println("+++++++++++++++++++++++++")
//      e.printStackTrace()
    }
  }
}
