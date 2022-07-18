object Q5 extends App{

    def calcEpaceTime(distance:Double):Double = {
        distance*8;
    }

    def calcTempoTime(distance:Double):Double = {
        distance*7;
    }

    println("Total running time is: "+(calcEpaceTime(2)+calcTempoTime(3)+calcEpaceTime(2)));
}