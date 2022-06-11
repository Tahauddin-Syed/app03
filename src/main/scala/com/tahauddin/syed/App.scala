package com.tahauddin.syed

/**
 * class with main method
 * 4 add functions with same logic.
 * only difference in return type and return keyword.
 */
object App {


  def main(args: Array[String]): Unit = {

    val sumA = addA(5, 10)
    println("sum is " + sumA)

    val sumB = addB(10, 10)
    println("sum is " + sumB)

    val sumC = addC(15, 10)
    println("sum is " + sumC)

    val sumD = addD(20, 10)
    println("sum is " + sumD)


  }


  /**
   * function with return keyword and return type
   * @param a
   * @param b
   * @return
   */
  def addA(a:Int, b:Int): Int = {
    var c = a + b
    return c
  }

  /**
   * function without return keyword
   * @param a
   * @param b
   * @return
   */
  def addB(a:Int, b:Int): Int = {
     a + b
  }

  /**
   * function without return type
   * and return keyword
   * @param a
   * @param b
   * @return
   */
  def addC(a:Int, b:Int) = {
    a + b
  }

  /**
   * function without return type
   * but return keyword : compilation error
   * @param a
   * @param b
   * @return
   */
  def addD(a:Int, b:Int) = {
    // return a + b
     a + b
  }



}
