package week2

object exercise {
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1 else f(a) * product(f)(a + 1, b) //> product: (f: Int => Int)(a: Int, b: Int)Int
 
 	def factorial(n: Int) = product(x => x)(1, n)
                                                  //> factorial: (n: Int)Int
 	
 	product(x => x)(1, 5)                     //> res0: Int = 120
 	factorial(5)                              //> res1: Int = 120
}