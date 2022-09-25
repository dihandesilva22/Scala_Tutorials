object Q5 extends App{

    def sumOfEven(n:Int):Int = n match{
        case x if(x<=2) => 0     //base case
        case x if((x-1)%2==0) => x-1+sumOfEven(x-1)
        case x => sumOfEven(x-1);
    }

    println(sumOfEven(7))
}