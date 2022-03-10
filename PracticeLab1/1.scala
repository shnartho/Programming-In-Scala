--------1-------------

package com.nayem.scala

object find_factorial
{
  def factorial(a:Int): Int = {
    var sum = 1
    for(i <- 1 to a){
      sum = sum * i;
    }
    return sum
  }

  def main(args: Array[String])
  {
    println(factorial(3))
  }

}

----------------------

--------2-------------
object value
{
  def print_value(): Unit = {
    var sum = 0
    for(i <- 1 to 100){
      sum = sum + 1;
      println(sum)
    }

  }

  def main(args: Array[String])
  {
    print_value
  }

}



----------------------


object value
{
  def print_value(): Unit = {
    var sum = 101
    for(i <- 1 to 100){
      sum = sum - 1;
      println(sum)
    }

  }

  def main(args: Array[String])
  {
    print_value
  }

}

---------------------
import scala.math


object fibonacci_calculation {
  def Fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) {
      return n
    } else {
      return Fibonacci(n - 1) + Fibonacci(n - 2)
    }
  }

  def main(args: Array[String]) {
    println(Fibonacci(3))
  }
}
------------------------