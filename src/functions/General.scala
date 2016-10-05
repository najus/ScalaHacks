package functions

object General {
  def timesTwo(arg: Int): Int = {
    println(arg + " multiplied by two is")
    arg * 2
  }
  
  def main(args: Array[String]){
    println(timesTwo(2))
  }
}