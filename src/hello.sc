
object hello{
  def abs(x:Int) = {if (x>0) x else -x} //等号后面就是函数体
  def abs1(x: Int):Int = {
    if (x>0)
      x
    else
      -x
  }
  println("hello world")
  abs(-2)
}

val d = 2 + 3 //评估已发生了
//d = 10

var x:Int = 10
x = 11

val a = new Array[String](3)
a(0) = "a"  //定义下标对应的元素
a(1) = "b"
a(2) = "c"

def e = 4 // 在定义def的时候,评估(evaluate)并没有发生,只有在使用的时候才评估

import scala.math.round
//假设y的平方根是1,x是我推测的平方根
def sqrt_test(x:Double,y:Double):Double ={
  if (round(x)==1)
    1
  else
    sqrt_test((x+y/x)/y,y)

}

//sqrt_test(4.0,2.0)


//round(3.1)

val xx = 1::2::Nil

