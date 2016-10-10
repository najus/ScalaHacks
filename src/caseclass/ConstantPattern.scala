package caseclass

object ConstantPattern extends App {
  def describe(x: Any) = x match {
    case 5 => "five"
    case true => "truth"
    case "hello" => "hi"
    case Nil => "the empty list"
    case _ => "something else"
  }

  println(describe(5))
  println(describe(true))
  println(describe(Nil))
}