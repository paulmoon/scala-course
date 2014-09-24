package week2

class Rational(x: Int, y: Int) {
  require(y != 0, "denominator must be nonzero")
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  private val g = gcd(x, y)

  def numer = x / g
  def denom = y / g

  override def toString: String =
    return numer + "/" + denom

  def + (that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom)

  def - (that: Rational) = this + -that

  def unary_- = new Rational(-numer, denom)

  def < (that: Rational) = numer * that.denom < that.numer * denom
  def max(that: Rational) = if (this < that) that else this
}

object rational {
  new Rational(1, 2) + new Rational(1, 2)         //> res0: week2.Rational = 1/1
  new Rational(3, 4) - new Rational(1, 2)         //> res1: week2.Rational = 1/4
  
  val a = new Rational(1, 5)                      //> a  : week2.Rational = 1/5
  val b = new Rational(1, 10)                     //> b  : week2.Rational = 1/10
  
  a < b                                           //> res2: Boolean = false
  a.max(b)                                        //> res3: week2.Rational = 1/5
  
}