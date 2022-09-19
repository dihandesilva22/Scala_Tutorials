case class Point(x:Double, y:Double){

  def add(othr:Point):Point = {
    Point(this.x+othr.x,this.y+othr.y)
  }

  def move(dx:Double,dy:Double):Point = {
    Point(x+dx,y+dy)
  }

  def distance(othr:Point):Double = {
    scala.math.sqrt(scala.math.pow((this.x-othr.x),2) + scala.math.pow((this.y-othr.y),2))
  }

  def invert():Point = {
    Point(this.y,this.x)
  }

}

object Q1 extends App{

    val p1 = Point(1, 3)
    val p2 = Point(2, 5)

    println(p1.add(p2))
    println(p1.distance(p2))
    println(p1.move(3,3))
    println(p2.invert())

}
