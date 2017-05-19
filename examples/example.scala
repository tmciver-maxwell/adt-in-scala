
trait X {
  val a: Int
  val b: String
}

object X {
  private case class XImpl(a: Int, b: String) extends X {}

  def mkX(a: Int, b: String): X = XImpl(a, b)
  def editA(x: X, newA: Int): X = XImpl(newA, x.b)
}

