package collections

object Practice {

  def main(args: Array[String]) {
    val list = List("cat", 1, true, "dog")
    println(list.map(convertFn))
    
  }

  val convertFn: PartialFunction[Any, String] = {
    case s: String => s
  }

}