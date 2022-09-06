object Q3 extends App{
    def toUpper(input:String):String = {
        input.toUpperCase();
    }

    def toLower(input:String):String = {
        input.toLowerCase();
    }

    def formatNames(name:String)(function:(String)=>String):String = {
        function(name);
    }

    println(formatNames("Benny")(toUpper(_)));  //underscore works as a placeholder
    println(formatNames("Niroshan".substring(0,2))(toUpper(_))+"Niroshan".substring(2,8));
    println(formatNames("Saman")(toLower(_)));
    println("Kumara".substring(0,5)+formatNames("Kumara".substring(5,6))(toUpper(_)));
}
