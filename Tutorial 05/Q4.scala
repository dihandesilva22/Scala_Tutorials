object Q4 extends App {
    def isEven(n:Int):Boolean= n match{
        case 0 => true     //base case
        case _ => isOdd(n-1)
    }
    def isOdd(n:Int):Boolean = {
        !(isEven(n))
    }

    println(isEven(7))
}