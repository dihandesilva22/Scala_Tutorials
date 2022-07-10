object Q3rest extends App {
    
  var (a:Int,b:Int,c:Int,d:Int) = (2,3,4,5);
  var k:Float = 4.3f;
  var g:Float = 4.0f;
  
  // println(--b*a + c*d--);   Scala: Doesn't support the decrement operator
  //                           Java: 24
  // println(a++);             Scala: Doesn't support the increment operator
  //                           Java: 2
  println(-2*(g-k)+c);         //Answer in both Java and Scala: 4.6000004
  // println (c=c++);          Scala: Doesn't support the increment operator
  //                           Java: 4
  // println (c=++c*a++);      Scala: Doesn't support the increment operator
  //                           Java: 15
}

