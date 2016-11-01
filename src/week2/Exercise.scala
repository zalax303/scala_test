package week2

/*
括号对应，写一个函数：def balance(chars: List[Char]): Boolean，接受一个字符列表作为输入参数，如果其中存在(和或)，则计算是否对应，如果一一对应，返回true，
否则返回false，如果不存在，则返回true。一一对应的定义为，必须以(为起始，以)为终结。
如“(if (zero? x) max (/ 1 x))”或“I told him (that it’s not (yet) done). (But he wasn’t listening)”应返回true，“--)”或“(()))”应返回false
 */

object Exercise  extends App{
  val x = "((())".toList
  var left_bracket_num = 0
  var right_bracket_num = 0

  def contains(text: List[Char]): Boolean = {

//    text match {
//      case head :: tail => {
//        if (head == '(')
//          left_bracket_num += 1
//        else if (head == ')')
//          right_bracket_num += 1
//        contains(tail)
//      }
//      case _ => 9999
//    }

//    if (left_bracket_num==right_bracket_num)
    if (text.count(s=>s.equals('('))==text.count(s=>s.equals(')')))
      true
    else
      false

  }

  println(contains(x))

  def pascal(row:Int):List[Int] = { row match {
    case 1 => List(1)
    case n:Int => List(1) ::: ((pascal(n-1) zip pascal(n-1).tail) map {case (a,b) => a+b}) ::: List(1)
  }
  }
  def pascal_num(row:Int,col:Int):Int = {
    pascal(row)(col)
  }

  println(pascal_num(6,1))

}