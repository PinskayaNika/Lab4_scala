object Test {
  def main(args: Array[String]): Unit = {
    val p1 = new Point[Int](1, 1)
    val p2 = new Point[Int](2, 2)
    val l1 = new Line[Int](p1, p2)
    val l2 = new Line[Int](0, 1, 1, 2)
    val l3 = new Line[Double](0.0, 1.0, 1.0, 2.0)
    val l4 = new Line[Float](1.0.toFloat, 2.0.toFloat, 3.0.toFloat, 4.0.toFloat)
    println("line = " + l3)
    println("length of line = " + l3.len())
    println("translated line = " + l3.translate(new Point[Double](1.0, 2.0)))

    println("line = " + l1)
    //println("length of line = " + l1.len())
    println("translated line = " + l1.translate(new Point[Int](1, 2)))
    println("rotated line = " + l3.rotate(3.14))
//    println("rotated line = " + l1.rotate(180))
  }
}
