import scala.io.StdIn.readInt;

object Q2 extends App{

    print("Input an integer: ");
    var num = readInt();
    num match {
        case x if x<=0 => print("Negative/Zero is input");
        case x if x%2==0 => print("Even number is given");
        case x if x%2==1 => print("Odd number is given");
    }
}