package week6

object books {
  case class Book(title: String, authors: List[String])

  val books: List[Book] = List(
    Book(
      title = "Structure and Interpretation of Computer Programs",
      authors = List("Abelson, Harald", "Sussman, Gerald J.")),
    Book(
      title = "Introduction to Functional Programming",
      authors = List("Bird, Richard", "Wadler, Phil")),
    Book(
      title = "Effective Java",
      authors = List("Bloch, Joshua")),
    Book(
      title = "Effective Java 2",
      authors = List("Bloch, Joshua")),
    Book(
      title = "Java Puzzlers",
      authors = List("Bloch, Joshua", "Gafter, Neal")),
    Book(
      title = "Programming in Scala",
      authors = List("Odersky, Marin", "Spoon, Lex", "Venners, Bill")))
                                                  //> books  : List[week6.books.Book] = List(Book(Structure and Interpretation of 
                                                  //| Computer Programs,List(Abelson, Harald, Sussman, Gerald J.)), Book(Introduct
                                                  //| ion to Functional Programming,List(Bird, Richard, Wadler, Phil)), Book(Effec
                                                  //| tive Java,List(Bloch, Joshua)), Book(Effective Java 2,List(Bloch, Joshua)), 
                                                  //| Book(Java Puzzlers,List(Bloch, Joshua, Gafter, Neal)), Book(Programming in S
                                                  //| cala,List(Odersky, Marin, Spoon, Lex, Venners, Bill)))

  for (b <- books; a <- b.authors if a startsWith "Bloch,")
    yield b.title                                 //> res0: List[String] = List(Effective Java, Effective Java 2, Java Puzzlers)

  ( for {
	    b1 <- books
	    b2 <- books
	    if b1 != b2
	    a1 <- b1.authors
	    a2 <- b2.authors
	    if a1 == a2
	  } yield a1
  ).distinct                                      //> res1: List[String] = List(Bloch, Joshua)

}