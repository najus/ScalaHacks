package caseclass

object VariablePattern extends App {
  def describe(x: Any) = x match {
    case 0 => "zero"
    case somethingElse => "not zero: " + somethingElse
  }

  println(describe(0))
  println(describe(3))
}