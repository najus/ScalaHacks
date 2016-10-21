package traits

object Main {
  def main(args: Array[String]) {
    def d1 = new Date(2016, 9, 11)
    def d2 = new Date(2017, 9, 11)
    if (d1 < d2)
      println("less than")
  }
}