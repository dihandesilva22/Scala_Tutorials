object Q1 extends App{

    def findGCD(a:Int,b:Int):Int = b match{
        case 0 => a   //base case
        case x if(x>a) => findGCD(x,a)
        case x => findGCD(x,a%x)
    }
    def prime(n:Int,m:Int=2):Boolean = {
        if(n<2) false    //base case
        else m match {
            case x if (x==n) => true    //base case
            case x if findGCD(n,x)>1 => false     //base case
            case x => prime(n,x+1)
        }
    }

    println("5 is prime: "+prime(5))
    println("8 is prime: "+prime(8))

}
