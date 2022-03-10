
  //task 1------------------------
  trait SomeTrait {
    def apply(element1: Int): Int
  }

  val Double = new SomeTrait {
    override def apply(element1: Int): Int = element1 * 2
  }

  println(Double(4))
  
  
  
  //Task  2-----------------------
object doublerF{
  def doubler:Int => Int = new Function1[Int, Int] {
  def apply (x: Int): Int = x * 2
  }

  def main(args: Array[String]): Unit = {
    print (doubler.apply(6))
  }

}



 //Task 3-----------------------
object concatF{
  def concat = new Function2[String, String, String] {
  def apply(x: String, y: String) = x +" "+ y
  }

  def main(args: Array[String]): Unit = {
    println(concat("Hello", "Nayem"))
  }

}


//Task 4---------------------
object concatF{
  def addTo5 = new Function2[Int, Int, Int] {
    def apply(x: Int, y: Int) = x + y
  }.curried(5)

  def main(args: Array[String]): Unit = {
    println(addTo5(5)) // return 10
  }

}



// task 5 -----

object lab6 {

  def cubeMaker(x:Int) ={
    x * 3  // auto returning last line
  }
  
  def main(args: Array[String]): Unit = {
    val n = List(1,2,3,4,5,6,7,8,9,10)

    val divisibleBy3 = n.filter(_%3 == 0)
    println(divisibleBy3)
    val cube = divisibleBy3.map(cubeMaker)
    cube.foreach(println)
  }
}



// task 6 ------------

object lab6 {

  def adderCurried(a: Int)(b: Int): Int = a + b

  def toAdderUncurried(f1: Int => Int => Int):(Int,Int)=>Unit ={
    (x:Int, y:Int) => println(x+y)
  }

  def main(args: Array[String]): Unit = {
    val adderUncurried = toAdderUncurried(adderCurried)
    adderUncurried(5, 6)
  }
}




// task 7 ------------------


object lab6 {

  def adder(a: Int, b: Int): Int = a + b

  def toAdderCurried(function: (Int, Int) => Int):Int => Int => Unit = {
    (x:Int) => (y:Int) => println(x+y)
  }
  def main(args: Array[String]): Unit = {
    val adderCurried = toAdderCurried(adder)
    adderCurried(5)(6)
  }
}


















