package week5

object mergesort {
	def msort(xs: List[Int]): List[Int] = {
	  val n = xs.length / 2
	  
	  if (n == 0) xs
	  else {
	    def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
	      case (Nil, ys) => ys
	      case (xs, Nil) => xs
	      case (x :: xs1, y :: ys1) =>
	        if (x < y) x :: merge(xs1, ys)
	        else y :: merge(xs, ys1)
	    }
	    
      val (first, second) = xs splitAt n
	    merge(msort(first), msort(second))
	  }
	}                                         //> msort: (xs: List[Int])List[Int]
  
	val nums = List(4, -1, 9, 5, -2, 0, 10)   //> nums  : List[Int] = List(4, -1, 9, 5, -2, 0, 10)
	msort(nums)                               //> res0: List[Int] = List(-2, -1, 0, 4, 5, 9, 10)
}