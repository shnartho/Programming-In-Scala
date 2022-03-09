package com.lab_2
import scala.collection.immutable._



object palindromecheck extends App{

  def isPalindrome[A](listt: List[A], n:Int):Unit = {

    if (listt(n) == listt(n + 2)) {
        println("Yes sir, The list is a Palindrome")

      } else {
        isPalindrome(listt, n+1)
      }
  }

  var i:Int = 0
  val list:List[String] = List("e", "x", "e")
  isPalindrome(list, i)


}



--------------222222----------------



object curry {
  def division (x:Int) = (y:Int) => x/y

  val divbytwo=(a: Int)=> {
    a / 2
  }

  def addition (x:Int) (y:Int) = x+y

  val addfive=(a: Int)=> {
    a + 5
  }

  def main(args: Array[String]): Unit = {
     println(division(50)(5))
     val somenum = division(5)
     println(somenum(5))
     println((addfive compose divbytwo)(100))
    println(addition(30)(40))
    val add = addition(40)_
    println(add(20))
    println((addfive andThen divbytwo)(99))


  }
}


-------3333---------

object format {
  def main(args: Array[String])
  {
    val floats = "Hello Sir, my name is Nayem. I will be here in poland for %d semesters" +
        " I will recieve around %f euro for my erusmus program which is really cool"
    val astring = "Hello Sir, my name is %s. I will be here in pol%cnd for 2 semesters"
    val char = 'a'
    val stringg = "Nayem"
    val semester = 2
    val grant = 2800.255
    val normal = floats.format(semester, grant)
    val stringres = astring.format(stringg, char)
    println(normal)
    println(stringres)

    val dollar = 1.74575646d
    val name = "Nayem"
    println(f"$name%s has $dollar%2.2f dollars")
  }
}


--------------4444---------

trait Wraptext {
  def wrapbefore() = print("*")
  def wrapafter() = println("*")
  def wrapmain(): Unit

  def htmlbefore() = println("<html>")
  def htmlafter() = println("</html>")
  def wrapwithcustomtag()

  def main(args: Array[String]): Unit = {
    wrapbefore()
    wrapmain()
    wrapafter()

    htmlbefore()
    wrapwithcustomtag()
    htmlafter()

  }
}
object MyApp extends Wraptext {
  override def wrapmain(): Unit = {
    print("TEXT")
  }
  override def wrapwithcustomtag(): Unit = {
    println("<body><h1>Hello world</h1></body>")
  }
}



