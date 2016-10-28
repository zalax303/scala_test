package week2

/**
  * Created by dsfs on 2016/10/28.
  */
class Constructors(x: Int, y: Int) {

  val x0 = x;
  val y0 = y;

  def this(x: Int) { //
    this(x, 1)  // 辅助构造函数的第一行只能调用主构造函数或者辅助构造函数,此处调用主构造函数
  }

  def this() {
    this(1)  //此处调用辅助构造函数
  }
}

object Constructors extends App {

  val c1 = new Constructors()
  println(c1.x0)
  println(c1.y0)

  val c2 = new Constructors(2)
  println(c2.x0)
  println(c2.y0)

  val c3 = new Constructors(3, 3)
  println(c3.x0)
  println(c3.y0)
}