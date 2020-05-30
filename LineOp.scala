import scala.reflect.ClassTag

abstract class LineOp[T] {
  def len(l: Line[T]): T
  def rotateS(l:Line[T], alpha:T):Point[T]
  def rotateE(l:Line[T], alpha:T):Point[T]
}

object LineOp {
  implicit object double extends LineOp[Double] {
    override def len(l: Line[Double]): Double = math.sqrt(math.pow(l.p2.x - l.p1.x, 2) + math.pow(l.p2.y - l.p1.y, 2))

    override def rotateS(l: Line[Double], alpha: Double): Point[Double] = {
      new Point[Double](l.p1.x * math.cos(alpha) - l.p1.y * math.sin(alpha), l.p1.x * math.sin(alpha) + l.p1.y * math.cos(alpha))
    }
    override def rotateE(l: Line[Double], alpha: Double): Point[Double] = {
      new Point[Double](l.p2.x * math.cos(alpha) - l.p2.y * math.sin(alpha), l.p2.x * math.sin(alpha) + l.p2.y * math.cos(alpha))
    }

  }

  implicit object float extends LineOp[Float] {
    override def len(l: Line[Float]): Float = math.sqrt(math.pow(l.p2.x - l.p1.x, 2) + math.pow(l.p2.y - l.p1.y, 2)).toFloat

    override def rotateS(l: Line[Float], alpha: Float): Point[Float] = {
      new Point[Float]((l.p1.x * math.cos(alpha) - l.p1.y * math.sin(alpha)).toFloat, (l.p1.x * math.sin(alpha) + l.p1.y * math.cos(alpha)).toFloat)
    }
    override def rotateE(l: Line[Float], alpha: Float): Point[Float] = {
      new Point[Float]((l.p2.x * math.cos(alpha) - l.p2.y * math.sin(alpha)).toFloat, (l.p2.x * math.sin(alpha) + l.p2.y * math.cos(alpha)).toFloat)
    }
  }


}

