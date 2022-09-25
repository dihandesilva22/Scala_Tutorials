import scala.io.StdIn.readInt;

object Q2 extends App{

    def findGCD(a:Int,b:Int):Int = b match{
        case 0 => a      //base case
        case x if(x>a) => findGCD(x,a)
        case x => findGCD(x,a%x)
    }

    def prime(n:Int,m:Int=2):Boolean = {
        if(n<2) false   //base case
        else m match {
            case x if (x==n) => true    //base case
            case x if findGCD(n,x)>1 => false  //base case
            case x => prime(n,x+1)
        }
    }

    def primeSeq(n:Int):Unit = {
        if(n>2) primeSeq(n-1)     //base case would be n is equal or less than 2
        var isPrime = prime(n)
        if(isPrime) println(n)
    }

    print("Input an integer for n for the sequence: ");
    var num = readInt();
    primeSeq(num-1)
}