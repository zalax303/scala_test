package week5

/**
  * Created by dsfs on 2016/11/17.
  */
object flatmap_test extends App{
  def toInt(s:String): Option[Int] = {
    try{
      Some(Integer.parseInt(s.trim))
    }catch {
      case e:Exception => None
      }
  }

  val s = Seq("1", "2", "foo", "3", "bar")
  println(s.map(toInt))
  println(s.map(toInt) flatten)
  println(s.flatMap(toInt))

}
