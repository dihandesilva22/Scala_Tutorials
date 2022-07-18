object Q2 extends App{

    def tempConverter(celcius:Double):Double = {
        celcius*1.8 + 32.0;
    }

    println("35 Celcius converts to "+tempConverter(35)+" Farenheit");
}