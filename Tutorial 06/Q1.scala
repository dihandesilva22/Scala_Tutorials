import scala.io.StdIn.readInt;
import scala.io.StdIn.readLine

object Q1 extends App{

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    val encrypt = (ch:Char,key:Int,alphabt:String) => 
        if(alphabt.indexOf(ch.toUpper)>=0) alphabt((alphabt.indexOf(ch.toUpper)+key)%alphabt.size)
        else ch
        
    val decrypt = (ch:Char,key:Int,alphabt:String) => 
        if(alphabt.indexOf(ch.toUpper)>=0) {
            if(alphabt.indexOf(ch.toUpper)-key>=0) alphabt((alphabt.indexOf(ch.toUpper)-key)%alphabt.size)
            else alphabt(((alphabt.size-1)-alphabt.indexOf(ch.toUpper)))
        }
        else ch

    val cipher=(algorithm:(Char,Int,String)=> Char,
                str:String,key:Int,alphabt:String) =>  str.map(algorithm(_,key,alphabt));


    print("Input the string: ");
    var str = readLine();
    print("Give a key to encrypt the string: ");
    var key = readInt();
    var encrypted = cipher(encrypt,str,key,alphabet);
    println("The encrypted string is: "+encrypted);
    println("The original string that was encrpted is: "+cipher(decrypt,encrypted,key,alphabet));                                
}