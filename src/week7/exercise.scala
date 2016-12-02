package week7

/**
  * Created by dsfs on 2016/11/29.
  */

import scala.collection.mutable.{Map => MMap}

abstract class Person {
  val student = "student"
  val teacher = "teacher"

  /*
    姓名 -> (年龄,身份,年级,分数)
   */

  val collect_person = MMap[String, (Int, String, Int, Int)](
    ("Teacher_1", (30, teacher, 0, 0)),
    ("Teacher_2", (28, teacher, 0, 0)),
    ("Teacher_3", (35, teacher, 0, 0)),
    ("Student_1", (18, student, 1, 100)),
    ("Student_2", (22, student, 2, 77)),
    ("Student_3", (19, student, 3, 90)),
    ("Student_4", (20, student, 4, 80))
  )

  def print_result() = {
    collect_person.foreach(println)
  }

}

trait Student extends Person {
  def add(name: String, age: Int, grade: Int, score: Int) = {
    collect_person += (name -> (age, student, grade, score))
  }

  def deleteStudent(name: String) = {
    collect_person.filter(_._2._2 == student).remove(name)
  }

  def update(name: String, age: Int, grade: Int, score: Int) = {
    collect_person(name) = (age, student, grade, score)
  }

  def sortByScore() = {
    //    collect_person.filter(_._2._2 == student).toList.sortBy(_._2._4)
    collect_person.filter(_._2._2 == student).toList.sortWith(_._2._4 > _._2._4)
  }

}

trait Teacher extends Person {
  def add(name: String, age: Int) = {
    collect_person += (name -> (age, student, 0, 0))
  }

  def deleteTeacher(name: String) = {
    collect_person.filter(_._2._2 == teacher).remove(name)
  }

  def update(name: String, age: Int) = {
    collect_person(name) = (age, student, 0, 0)
  }

  def sortByAge() = {
    //    collect_person.filter(_._2._2 == teacher).toList.sortBy(_._2._1)
    collect_person.filter(_._2._2 == teacher).toList.sortWith(_._2._1 > _._2._1)
  }

}


object exercise extends App {
  val p = new Person with Student with Teacher
  println(p.sortByAge())
}
