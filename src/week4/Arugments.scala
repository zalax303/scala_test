package week4

/**
  * Created by dsfs on 2016/11/7.
  */
object Arugments extends App {
  def variableArg(g: String*) = {
    g.foreach(x => println(x))
  }

  def printPerson(name: String, age: Int = 10) = {
    printf("name is %s , age is %d\n", name, age)
    //是printf不是println
    println(s"name is $name, age is $age")
  }

  variableArg("1", "2", "3", "4")
  val k = Array("10", "11", "12", "13")
  variableArg(k: _*) //把array中每个元素拆散,逐个传到String*中

  printPerson(name = "john")
}
