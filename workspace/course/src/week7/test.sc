package week7

object test {
  val problem = new Pouring(Vector(4, 7, 19))     //> problem  : week7.Pouring = week7.Pouring@1afca88
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with we
                                                  //| ek7.test.problem.Move] = Vector(Empty(0), Empty(1), Empty(2), Fill(0), Fill(1
                                                  //| ), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pour(2,0), Pour(2,1))
                                                  //| 
   
  problem.pathSets                                //> res1: Stream[Set[week7.test.problem.Path]] = Stream(Set(--> Vector(0, 0, 0))
                                                  //| , ?)
  
  
  problem.solutions(5)                            //> res2: Stream[week7.test.problem.Path] = Stream(Fill(2) Pour(2,1) Empty(1) Po
                                                  //| ur(2,1)--> Vector(0, 7, 5), ?)
  println("Hello World")                          //> Hello World
  
}