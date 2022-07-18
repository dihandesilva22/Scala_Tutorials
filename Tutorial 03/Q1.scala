object Q1 extends App{

    def calcArea(radius:Double):Double = {
        Math.PI*radius*radius;
    }
    
    println("Area of the disk: "+calcArea(5));

}