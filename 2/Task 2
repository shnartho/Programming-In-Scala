---------------TASK 1----------------

package com.lab_2
import scala.collection.immutable._

object Task_1{
     def two_parameters(lists:List[Int], integer:Int): Unit = {
       for ( i <- lists) {
         if (i > integer) {
           println(i)
         }
       }
     }

  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4,5,6,7,8,9)
    two_parameters(list, 5)
  }
}








-----------------TASK 2------------------

package com.lab_2
import scala.collection.immutable._


object Task_1 {
  def two_parameters(list11:List[Int], list22:List[Int]): Unit = {
    val result = list11(0) +" "+ list22(0)+" "+ list11(1) +" "+ list22(1)+" " + list11(2) +" "+ list22(2)
    println(result)
  }

  def main(args: Array[String]) {
    val list1 = List(1, 3, 5)
    val list2 = List(2, 4, 6)
    two_parameters(list1, list2)
  }
}



-----------------TASK 3-------------------

import scala.collection.immutable._


object Task_1 {
  var i:Int = 0
  def sum(list:List[Int]): Int = list match{
    case Nil => 0
    case x::xs => {
      i += 1
      x + sum(xs)
    }
    i
  }
  def main(args: Array[String]) {
    val list1 = List(1, 3, 5, 6,67, 8, 9, 45)
    val result = sum(list1)
    println(result)
  }
}



-------------Task 4 -------------------------
package com.lab_2

object NewtonsMethod {
  def main(args: Array[String]) {
    Newton_Raphson
  }

  def Newton_Raphson {

    val fx = (x: Double) => 3*x + Math.sin(x) - scala.math.pow(Math.E, x)
    val fxPrime = (x: Double) => 3 + Math.cos(x) - scala.math.pow(Math.E, x)

    val initialGuess = 1.0
    val tolerance = 0.00010

    val answer = newtonsMethod(fx, fxPrime, initialGuess, tolerance)

    println(answer)
  }

  def newtonsMethod(fx: Double => Double,
                    fxPrime: Double => Double,
                    x: Double,
                    tolerance: Double): Double = {
    var x1 = x
    var xNext = newtonsMethodHelper(fx, fxPrime, x1)
    while (Math.abs(xNext - x1) > tolerance) {
      x1 = xNext
      println(xNext) // debugging (intermediate values)
      xNext = newtonsMethodHelper(fx, fxPrime, x1)
    }

    return xNext
  }

  def newtonsMethodHelper(fx: Double => Double,
                          fxPrime: Double => Double,
                          x: Double): Double = {
    return x - fx(x) / fxPrime(x)
  }


}


