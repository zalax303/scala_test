package week6

/**
  * Created by dsfs on 2016/11/21.
  */
class Rational(val numerator: Int, val denominator: Int) {
  def gcd(x: Int, y: Int): Int = {
    if (y == 0) x
    else gcd(y, x % y)
  }

  val g = gcd(numerator.abs, denominator.abs)
  val n = numerator / g
  val d = denominator / g

  def +(other: Rational) = {
    new Rational(n * other.d + other.n * d, d * other.d)
  }

  def +(other: Int) = {
    new Rational(n + other * d, d)
  }

  def -(other: Rational): Rational =
    new Rational(
      n * other.d - other.n * d,
      d * other.d
    )

  def -(other: Int): Rational =
    new Rational(n - other * d, d)

  def *(other: Rational): Rational =
    new Rational(n * other.n, d * other.d)

  def *(other: Int): Rational =
    new Rational(n * other, d)

  def /(other: Rational): Rational =
    new Rational(n * other.d, d * other.n)

  def /(other: Int): Rational =
    new Rational(n, d * other)

  override def toString: String = n + "/" + d

}

object Rational extends App {
  val x = new Rational(2, 3)
  println(x + 2)
  println(x - 2)
  println(x * 2)
  println(x / 2)

}