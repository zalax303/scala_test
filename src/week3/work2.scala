package week3

/**
  * Created by dsfs on 2016/10/31.
  */
object work2 extends App {

  class Person(n: String, a: Int) {
    def name = n

    // 定义成def  http://stackoverflow.com/questions/18887264/what-is-the-difference-between-def-and-val-to-define-a-function
    def age = a

    //  class Person(name:String, age:Int){
    //    val this.name = name
    //    val this.age = age
  }

  object Person {
    def apply(name: String, age: Int) = {
      new Person(name, age)
    }

    val persons = List[Person](
      Person("tom", 12), Person("john", 20),
      Person("mike", 22), Person("brown", 19),
      Person("jenny", 17), Person("green", 23),
      Person("jane", 18), Person("joan", 25)
    )

    val result = persons filter (person => person.age > 20) map (person => person.name)
    //    val result = persons.filter(person => person.age > 20).map(person => person.name)
    //    val result_1 = for (person <- persons if person.age > 20) yield person.name
  }

  println(Person.result)
//  println(Person.result_1)
}
