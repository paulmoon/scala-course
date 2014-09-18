package week1

object factorial_session {
	def factorial(n: Int): Int =
		if (n == 0) 1 else n * factorial(n - 1)
                                                  //> factorial: (n: Int)Int

	def tailRecursiveFactorial(n: Int, curr: Int): Int =
		if (n == 0) curr else tailRecursiveFactorial(n - 1, n * curr)
                                                  //> tailRecursiveFactorial: (n: Int, curr: Int)Int
	
	factorial(5)                              //> res0: Int = 120
	tailRecursiveFactorial(5, 1)              //> res1: Int = 120
}