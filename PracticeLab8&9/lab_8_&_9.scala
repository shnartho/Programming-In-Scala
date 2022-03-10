Lab 8 ---------

abstract class MyAbstractList[+T] {

  def head(): T
  def tail(): MyAbstractList[T]
  def isEmpty(): Boolean
  def add[U >: T](a: U): MyAbstractList[U]
  def print: String
  override def toString: String = "[" + print + "]"
  def foreach(op: T => Unit): Unit
  def filter(pred: T => Boolean): MyAbstractList[T]

  def ++[U >: T](other: MyAbstractList[U]): MyAbstractList[U]
  def map[U >: T](transf: T => U): MyAbstractList[U]
  def flatMap[U](transf: T => MyAbstractList[U]): MyAbstractList[U]
}

case object Empty extends MyAbstractList[Nothing] {
  def head(): Nothing = throw new UnsupportedOperationException
  def tail(): MyAbstractList[Nothing] = throw new UnsupportedOperationException
  def isEmpty(): Boolean = true
  def print: String = ""
  def add[U >: Nothing](a: U): MyAbstractList[U] = new LList(a, Empty)

  override def foreach(op: Nothing => Unit): Unit = ()
  override def filter(pred: Nothing => Boolean): MyAbstractList[Nothing] = Empty
  override def ++[U >: Nothing](other: MyAbstractList[U]): MyAbstractList[U] = other
  override def map[U >: Nothing](transf: Nothing => U): MyAbstractList[U] = Empty
  override def flatMap[U](transf: Nothing => MyAbstractList[U]): MyAbstractList[U] = Empty
}

case class LList[+T](h: T, t: MyAbstractList[T]) extends MyAbstractList[T] {
  override def head(): T = h
  override def tail(): MyAbstractList[T] = t
  override def isEmpty(): Boolean = false
  override def print: String = {
    def printHelper(elements: String, list: MyAbstractList[T]): String = {
      if (list.tail.isEmpty()) elements + list.head
      else printHelper(elements + list.head + ",", list.tail)
    }
    printHelper("", this)
  }

  override def add[U >: T](a: U): MyAbstractList[U] = new LList[U](a, this)

  override def foreach(op: T => Unit): Unit = {
    op(head)
    tail.foreach(op)
  }

  override def filter(pred: T => Boolean): MyAbstractList[T] = {
    if(pred(head)) new LList(head, tail.filter(pred))
    else tail.filter(pred)
  }

  def ++[U >: T](other: MyAbstractList[U]): MyAbstractList[U] = {
    new LList(h, t ++ other)
  }

  def map[U >: T](transf: T => U): MyAbstractList[U] = {
    new LList(transf(h), t.map(transf))
  }

  def flatMap[U](transf: T => MyAbstractList[U]): MyAbstractList[U] = {
    transf.apply(h) ++ t.flatMap(transf)
  }
}

Lab 9 ---------

def less[T <: Comparable[T]](i: T, j: T) = i.compareTo(j) < 0

  def swap[T](xs: Array[T], i: Int, j: Int) { val tmp = xs(i); xs(i) = xs(j); xs(j) = tmp }

  def insertSort[T <: Comparable[T]](xs: Array[T]) {
    for { i <- 1 to xs.size
          j <- List.range(1, i).reverse
          if less(xs(j),xs(j - 1)) } swap(xs, j, j -1)
  }
