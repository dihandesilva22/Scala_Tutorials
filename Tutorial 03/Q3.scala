object Q3 extends App{

    def calcVolume(radius:Double):Double = {
        (4.0/3.0)*Math.PI*radius*radius*radius;
    }

    println("Volume of the sphere is: "+calcVolume(5));
}