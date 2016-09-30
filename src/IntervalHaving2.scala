

object IntervalHaving2 {
  def main(args: Array[String]) {
    val x1 = 1.0
    val x2 = 2.0
    val tolerance = 0.00005

    val fx = (x: Double) => x * x * x + x * x - 3 * x - 3

    val answer = halveTheInterval(fx, x1, x2, tolerance)

    println(answer)
  }

  def halveTheInterval(fx: Double => Double, x1: Double, x2: Double, tolerance: Double): Double = {

    var x1wkg = x1
    var x2wkg = x2
    while (Math.abs(x1wkg - x2wkg) > tolerance) {
      var x3 = (x1wkg + x2wkg) / 2.0
      if (signsAreOpposite(fx(x3), fx(x1wkg))) x2wkg = x3 else x1wkg = x3
    }
    return x1wkg
  }

  def signsAreOpposite(x: Double, y: Double): Boolean = {
    if (x < 0 && y > 0) return true
    else if (x > 0 && y < 0) return true
    else return false
  }
}