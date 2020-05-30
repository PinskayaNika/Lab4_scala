import scala.reflect.ClassTag

class Line[T : Numeric](val p1: Point[T], val p2: Point[T]) {
  def this(x1: T, y1: T, x2: T, y2: T) = this(new Point[T](x1, y1), new Point[T](x2, y2))

  def translate(vector: Point[T]): Line[T] = {
    new Line[T](p1 + vector, p2 + vector)
  }


  def rotate(alpha: T)(implicit rot: LineOp[T]): Line[T] = {
    new Line[T](rot.rotateS(this, alpha),rot.rotateE(this, alpha))
  }

  def len()(implicit op: LineOp[T]): T = op.len(this)

  override def toString: String = "line(" + p1.toString + ", " + p2.toString + ")"
}
