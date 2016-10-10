package ninetynine

object P02 extends App {

  def lastButOne[A](list: List[A]): A =
    if (list.isEmpty) throw new NoSuchElementException
    else list.init.last

  def lastButOneRecursive[A](list: List[A]): A = list match {
    case h :: _ :: Nil => h
    case _ :: tail => lastButOne(tail)
    case _ => throw new NoSuchElementException
  }

  println("Last but one= " + lastButOne(List(1, 2, 3, 4, 5)))
  println("Last but one recursive= " + lastButOneRecursive(List(1, 2, 3, 4, 5, 6)))
}