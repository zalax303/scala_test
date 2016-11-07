package week4

import java.io.{File, PrintWriter}


/**
  * Created by dsfs on 2016/11/7.
  */
object Carrying extends App{
  def withPrintWriter(file: File)(op: PrintWriter => Unit): Unit ={
    val writer: PrintWriter = new PrintWriter(file)
    try {
      op(writer)
    } finally
    writer.close()
  }

  val file = new File("abc.txt")

  withPrintWriter(file){
    writer => writer.println("Hello World")
  }

}
