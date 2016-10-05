package classes

object CalculatorMain extends App {
  val hpCalc = new Calculator("HP")
  println(hpCalc.color)
  
  val tiCalc = new Calculator("TI")
  println(tiCalc.color)
  
  val otherCalc = new Calculator("Casio")
  println(otherCalc.color)
  
}