package week5

import scala.collection.mutable

/**
  * Created by dsfs on 2016/11/17.
  */
object exercise extends App {
  val school = new mutable.HashMap[String, Int]
  school += ("Tom" -> 1, "Jim" -> 2, "Mike" -> 2, "LiLi" -> 5)

  def addName(name: String, grade: Int) = {
    school += (name -> grade)
    println(school)
  }

  def deleteName(name: String) = {
    school -= name
    println(school)
  }

  def updateGrade(name: String, grade: Int) = {
    school(name) = grade
    println(school)
  }

  def getNameByName(name:String) = {
    printf(s"name is $name, grade is ${school.getOrElse(name,"no this name")}")
  }

  def getNameByGrade(grade: Int) = {
    school.foreach((tuple: (String, Int)) => if (tuple._2 == grade) printf(s"grade is $grade, students name is ${tuple._1} ;"))
  }

//  getNameByGrade(2)

}
