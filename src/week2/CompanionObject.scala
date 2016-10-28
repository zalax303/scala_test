package week2

/**
  * Created by dsfs on 2016/10/28.
  */


class CompanionObject(n: String) {

  private val name = n

  def this() {  //辅助构造函数
    this("abc")
  }

  def show() = println(name)

  def showList() = println(name.toList)

  import CompanionObject._  // 导入object CompanionObject中所有的东西

  def getValue(key: Char) = dictionary.getOrElse(key, "0")

  def merge(content: List[Char], result: List[String]): List[String] = {

    content match {
      case Nil => result  //结束条件,当我要处理的content是空时,直接返回result
      case head::tail => {
        print("head is "); println(head)
        print("tail is "); println(tail)
        val left = result :+ getValue(head)  //新的临时结果 合并方法的为 :+
        print("left is "); println(left)
        merge(tail, left)  //递归
      }
    }
  }

  def translate(): List[String] = {

    val chars = name.toList  //转换成字符串list list[Char]

    merge(chars, List())  //List()是空列表,存放结果集
  }
}

object CompanionObject {

  private val dictionary = Map('a' -> "1", 'b' -> "2", 'c' -> "3")

  def apply(n: String) = { //不同参数类型的构造函数
    new CompanionObject(n)
  }

  def apply(i: Int) = {  //不同参数类型的构造函数
    new CompanionObject()  //调用的辅助的构造函数
  }

  def main(args: Array[String]) = {  // 程序入口点:object的main方法

    val obj = CompanionObject(1)  //调用的就是CompanionObject中的apply方法
    obj.show()
    obj.showList()

    val l = obj.translate()
    println(l)
  }
}
