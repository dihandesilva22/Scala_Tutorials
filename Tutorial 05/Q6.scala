object Q6 extends App{

    def fibonacci(n:Int):Int= n match{
        case 0 => 0      //base case
        case 1 => 1      //base case
        case _ => fibonacci(n-1)+fibonacci(n-2)
    }
    def fibonacciSeq(n:Int):Unit= {
        if (n > 0) fibonacciSeq(n-1)
        println(fibonacci(n))
    }

    fibonacciSeq(10)
}