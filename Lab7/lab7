1. def getMethod1(): (String, String) => Int = {
    lengthTotal
  }

  def lengthTotal(firstString: String, secondString: String): Int = {
    firstString.length + secondString.length
  }

  println(getMethod1()("AAA", "BBB"))

  def getMethod2(): (Double, String) => String = {
    concat
  }

  def concat(a: Double, b: String): String = {
    b + a
  }

  println(getMethod2()(Math.PI, "%.6f"))


2. def repeatFunction(f: (Int, Int) => Int, n: Int, result : Int = 0): Int = {
    if (n <= 0) result
    else repeatFunction(f, n - 1, f(6,7))
  }

  def add(a: Int, b: Int): Int = a + b

  println(repeatFunction(add, 3))

3.

def adder(a: Int, b: Int): Int = a + b
def toAdderCurried(f: (Int, Int) => Int) = (a: Int) => (b: Int) => f(a,b)

def adderCurriedVal = toAdderCurried(adder)
println(adderCurriedVal(1)(2))

def adderCurried(a: Int)(b: Int): Int = a + b

def toAdderUncurried(f: Int => Int => Int) = (a: Int, b: Int) => f(a)(b)

val uncurried = toAdderUncurried(adderCurried)
println(uncurried(3,4))

4.
abstract class MyAbstractList {
  /*
     single linked list with int
     head = first element of list
     tail = remainder of the list
     isEmpty
     add(int) new list with added element
     toString - return string representation
   */
  def head(): Int
  def tail(): MyAbstractList
  def isEmpty(): Boolean
  def add(a: Int): MyAbstractList
  def toString(): String
}

object Empty extends MyAbstractList {
  override def head(): Int = throw new NoSuchElementException("List is empty")

  override def tail(): MyAbstractList = Empty

  override def isEmpty(): Boolean = true

  override def toString: String = "[]"//super.toString

  override def add(a: Int): MyAbstractList = new LList(a, Empty)
}

class LList(h: Int, t: MyAbstractList) extends MyAbstractList {
  override def head(): Int = h

  override def tail(): MyAbstractList = t

  override def isEmpty(): Boolean = false

  override def add(a: Int): MyAbstractList = new LList(a, this)

  override def toString: String = "[" + h + " " + t.toString().drop(1)  
}

object LinkedListTest extends App {
  val myAbstractList = new LList(1, Empty)
  val list2 = myAbstractList.add(3)
  val list3 = Empty
  println(list3.add(5))
  println(list2.add(12))
}
