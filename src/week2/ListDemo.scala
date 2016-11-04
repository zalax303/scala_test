package week2

/**
  * Created by dsfs on 2016/10/26.
  */
object ListDemo extends App{
//  val a = "a" :: "b" :: Nil //元素合并成list
  /*
  要在最后用到 Nil 的理由是::是定义在 List 类上的方法。如果你想只是写成 1 :: 2 :: 3，由于 3 是Int 类型，没有::方法，因此会导致编译失败。
   */
  val a = "(" :: Nil
  println(a)

  val b = List("c", "d") ::: a  //list的合并
  println(b)

  b match {
    case Nil => println("empty list")
    case h::t =>  //分解成两个元素
      println("head is ")
      println(h)
      println("tail is ")
      println(t)
  }

  println(b)
  println(b.contains("d"))

}
