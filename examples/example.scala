
trait X {
  val a: Int
  val b: String
}

object X {
  private case class XImpl(a: Int, b: String) extends X {}

  def unapply(x: XImpl): Option[(Int, String)] = Some((x.a, x.b))
  def mkX(a: Int, b: String): X = XImpl(a, b)
  def editA(x: X, newA: Int): X = XImpl(newA, x.b)
}

val x = X.mkX(1, "Hi")
val y = X.mkX(1, "Hi")
val z = X.mkX(2, "Hi")

println("x == y: " + (x == y))
println("x == z: " + (x == z))
