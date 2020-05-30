class Point[T](val x: T, val y: T)(implicit op: Numeric[T]) {
  def +(o: Point[T]): Point[T] = new Point[T](op.plus(x, o.x), op.plus(y, o.y))

  override def toString: String = "(" + x.toString + ", " + y.toString + ")"
}
