package week5

/**
  * Created by dsfs on 2016/11/14.
  */
object ListLast extends App {
  def last[T](xs: List[T]): T = xs match {
    case Nil => throw new Error("empty list")
    case List(x) => x
    case h :: t => last(t)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case Nil => throw new Error("empty list")
    case List(x) => Nil
    case h :: t => h :: init(t)
  }

//  println(last(1 :: 2 :: 3 :: Nil))
  println(init(1 :: 2 :: 3 :: Nil))
}
