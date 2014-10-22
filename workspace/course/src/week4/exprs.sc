package week4

object exprs {
	def show(e: Expr): String = e match {
		case Number(x) => x.toString
		case Sum(l, r) => show(l) + " + " + show(r)
	}                                         //> show: (e: week4.Expr)String

	show(Number(1))                           //> res0: String = 1
	show(Sum(Number(1), Number(5)))           //> res1: String = 1 + 5
}