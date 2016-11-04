/**
  * Created by dsfs on 2016/9/30.
  */

object test {

  private def filesHere = new java.io.File(".").listFiles

  def filesEnding(query: String) =
    for (file <- filesHere; if file.getName.endsWith(query))
      yield file

  def filesMatching(query: String, matcher: (String, String) => Boolean) = {
    for (file <- filesHere; if matcher(file.getName, query))
      yield file
  }

  def filesContaining(query: String) =
    filesMatching(query, _.contains(_))

}