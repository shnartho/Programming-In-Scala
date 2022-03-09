package com.lab_2
import scala.collection.immutable._

object lab5 extends App {


  class Counter(count: Int = 0) {
  
    def getCurrentCount() : Int = {
      this.count

    }
    
    
    
    def increment() : Counter = {
    
      new Counter(this.count + 1)

    }
    
    
    def getCurrentCounter(): Counter ={
    
      this
    }
    
    
    def decrement() : Counter = {
    
      new Counter(this.count - 1)
    }


    def decrement(amount : Int) : Counter = {
    
    
      def decrementer(currentCounter : Counter, times : Int): Counter ={
      
        if(times > 0){
        
          deccrementer(currentCounter.decrement(),times-1)
          
          
        }else{
        
        
          currentCounter
        }
      }
      decrementer(this,amount)
    }
    
    
    
    
    
    def increment(amount : Int) : Counter = {
    
      def incrementer(currentCounter : Counter, times : Int): Counter ={
      
        if(times > 0){
        
          incrementer(currentCounter.increment(),times-1)
          
        }else{
          currentCounter
        }
      }
      
      
      incrementer(this,amount)
    }
  }

  def :+(aCounter : Counter, times : Int) : Counter = {
    aCounter.increment(times)

  }

  def -(aCounter:Counter) : Counter = {
    new Counter(this.getCurrentCount() - aCounter.getCurrentCount())



    def +(aCounter:Counter) : Counter = {
      new Counter(this.getCurrentCount() + aCounter.getCurrentCount())

    }
    
    

    def +:(aCounter : Counter, times : Int) : Counter = {
      val anotherCounter = new Counter(times)
      anotherCounter.increment(aCounter.getCurrentCount())
    }

  }
  
  


}



















