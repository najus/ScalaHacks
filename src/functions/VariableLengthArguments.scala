package functions

object VariableLengthArguments extends App {

  def capitalizeAll(args: String*) = {
    args.map { arg => arg.capitalize }
  }

  capitalizeAll("variable", "length").map { x => println(x) }
}