package caseclass

object ExprMain extends Expr with App {
  println(simplifyTop(UnOp("+", UnOp("-", Var("x")))));
}