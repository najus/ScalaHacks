

object TimerAnonymous {

  def oncePerSecond(a: () => Unit) {
    while (true){a(); Thread.sleep(1000)}
  }

  def main(args: Array[String]) {
    oncePerSecond(
        () => println("time flies like an arrow..."))
  }
}