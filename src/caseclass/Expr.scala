package caseclass

abstract class Expr {
  case class Var(name: String) extends Expr
  case class Number(num: Double) extends Expr
  case class UnOp(operator: String, arg: Expr) extends Expr
  case class BinOp(operator: String, left: Expr, right: Expr) extends Expr

  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e // Double Negation
    case BinOp("+", e, Number(0)) => e // Adding Zero
    case BinOp("*", e, Number(1)) => e // Multiplying by one
    case _ => expr
  }

}