package week3

/**
  * Created by dsfs on 2016/10/31.
  */
class Book(t: String, a: List[String]) {
  val title = t
  val authors = a

  override def toString: String = t + ":" + a.toString()

  def ==(book: Book) = { //自定义判断两个Book对象是否相等
    title == book.title && authors == book.authors
  }
}

object Book extends App {
    def apply(t: String, a: List[String]) = {
      new Book(t, a)
    }

    def find(books: List[Book]) = {
      for {
        b1 <- books
        b2 <- books
        if b1.title != b2.title
        a1 <- b1.authors
        a2 <- b2.authors
        if a1 == a2
      } yield a1
    }

    val books = List[Book](
    Book("Structure and Interpretation of Computer Programs", List("Abelson, Harald", "Sussman, Gerald J.")),
    Book("Introduction to Functional Programming", List("Bird, Richard", "Wadler, Phil")),
    Book("Effective Java", List("Bloch, Joshua")),
    Book("Java Puzzlers", List("Bloch, Joshua", "Gafter, Neal")),
    Book("Programming in Scala", List("Odersky, Martin", "Spoon, Lex", "Venners, Bill"))
    )

    println(books)
    println(find(books))

  }


