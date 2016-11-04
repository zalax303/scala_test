package week3


object Exercise extends App {
  val statements = List("WATCH OUT!", "DO YOU HEAR ME?", "Do you speak English?", "What DID you do?", "      ")

  def result: String = ""

  def answer(statements: List[String]) = {
    for {
      statement <- statements
      result = if (statement == statement.map(_.toUpper) && statement.trim.length != 0) "\"Whoa, chill out!\""
      else if (statement != statement.map(_.toUpper) && statement.endsWith("?") && statement.trim.length != 0) "\"Sure\""
      else if (statement.trim.length == 0) "\"Fine. Be that way.\""
    } yield result
  }

  println(answer(statements))
}

