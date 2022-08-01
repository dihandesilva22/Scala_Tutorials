object Q1 extends App{
    def interest(deposit:Double):Double = {
        deposit match {
            case x if x<0 => 0.0;
            case x if x<=20000 => deposit*0.02;
            case x if x<=200000 => deposit*0.04;
            case x if x<=2000000 => deposit*0.035;
            case x if x>2000000 => deposit*0.065;
        } 
    }


    // println("Interest for 10000 would be: "+interest(10000));       // Test Data
    // println("Interest for 100000 would be: "+interest(100000));
    // println("Interest for 1000000 would be: "+interest(1000000));
    // println("Interest for 10000000 would be: "+interest(10000000));
}