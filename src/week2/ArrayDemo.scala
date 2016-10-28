package week2

/**
  * Created by dsfs on 2016/10/26.
  */

object ArrayDemo extends App{
  val arr = new Array[String](3)
  arr(0) = "test1"
  arr(1) = "test2"
  arr(2) = "test3"

//  println(arr(0))
//  println(arr(1))
//  println(arr(2))

  for(arg <- arr){
    println(arg)
  }

  arr.foreach {f => println(f)} //函数式编程 lambda表达式

}