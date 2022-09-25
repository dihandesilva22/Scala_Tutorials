object Q3 extends App{

    def sum(n:Int):Int = n match{
        case 0 => 0    //base case
        case x if(x>0) => x+sum(x-1)
    }

    println("Sum is "+sum(5))
}