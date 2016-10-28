package week2

/**
  * Created by dsfs on 2016/10/26.
  */
object MapDemo extends App{
  val a = Map(1->"abc", 2->"bcd")

  for( (x,y) <- a){
    print("key is  ");println(x)
    print("value is ");println(y)
  }

  for( tuple <- a){
    print("key is  ");println(tuple._1)
    print("value is ");println(tuple._2)
  }

  println(a(1))
  println(a get 1)  //a.get(1)  返回一个Some对象
  println(a.getOrElse(1,"a"))


}
