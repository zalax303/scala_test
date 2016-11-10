package week4

/**
  * Created by dsfs on 2016/11/9.
  */
object exercise extends App {
  type Set = Int => Boolean

  def singletonSet(elem: Int): Set = {
    _ == elem
  }

  def contains(s: Set, elem: Int): Boolean = s(elem)

  def union(s: Set, t: Set): Set = {
    x => {
      contains(s, x) || contains(t, x)
    }
  }

  def intersect(s: Set, t: Set): Set = {
    x => {
      contains(s, x) && contains(t, x)
    }
  }

  def diff(s: Set, t: Set): Set = {
    x => {
      contains(s, x) & !contains(t, x)
    }
  }

  def filter(s: Set, p: Int => Boolean): Set = {
    x => {
      contains(s, x) && p(x)
    }
  }

  val result = 50

  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
      if (a == result) true
      else if (contains(s, a) && !p(a)) false
      else iter(a + 1)
    }
    iter(-result)
  }

  def exists(s: Set, p: Int => Boolean): Boolean = forall(filter(s, p), p)

  println(forall(union(singletonSet(3), singletonSet(4)), x => x>= 0))

}
