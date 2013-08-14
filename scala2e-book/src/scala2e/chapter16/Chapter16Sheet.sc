package scala2e.chapter16

object Chapter16Sheet {
  
  4.5 % 1                                         //> res0: Double(0.5) = 0.5
  4 % 1                                           //> res1: Int(0) = 0
  
  // 'toString' returns canonical representation of a list:
  List("a", "b", "c").toString                    //> res2: String = List(a, b, c)
  // res0: String = List(a, b, c)

  // 'mkString' is more suitable for human consumption:
  // mkString(pre, sep, post)  // returns:
  // pre + xs(0) + sep + xs(1) + sep + ... + sep + xs(xs.length - 1) + post

  // also:
  val abc = List("a", "b", "c")                   //> abc  : List[String] = List(a, b, c)
  abc mkString " - " // equals                    //> res3: String = a - b - c
  abc mkString("", " - ", "")  // also, you can omit all arguments (default to empty string)
                                                  //> res4: String = a - b - c

  // a variant of 'mkString' which appends string to a 'scala.StringBuilder' object:
  val buf = new StringBuilder                     //> buf  : StringBuilder = 
  List("a", "b", "c") addString(buf, "(", "; ", ")")
                                                  //> res5: StringBuilder = (a; b; c)
  
  val it = abc.iterator                           //> it  : Iterator[String] = non-empty iterator


  val xs = List("a", "b", "c")                    //> xs  : List[String] = List(a, b, c)
  val arr2 = new Array[String](7)                 //> arr2  : Array[String] = Array(null, null, null, null, null, null, null)
  
  xs copyToArray(arr2, 3)
  arr2                                            //> res6: Array[String] = Array(null, null, null, a, b, c, null)
}