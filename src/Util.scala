object Util {
  def decorate(str: String, left : String = "[", right: String = "]") = {
    left + str + right
  }

  def sum(args : Int*) = {
    var result = 0
    for (arg <- args) result += arg
    result
  }

  def recursiveSum(args : Int*) : Int = {
    if(args.length == 0) 0
    else args.head + recursiveSum(args.tail : _*)
  }
}
