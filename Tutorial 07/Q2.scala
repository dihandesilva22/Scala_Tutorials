class Rational(num:Int,den:Int){

    require(den>0,"The denominator must be positive") 
    private def gcd(a: Int, b: Int): Int = {
        if(b == 0) a 
        else {
            if(a<Math.abs(b)) gcd(Math.abs(b),a)
            else gcd(Math.abs(b), a%Math.abs(b))
        } 
    }
    val divisor = gcd(num,den);

    val numer:Int = num/divisor;
    val denom:Int = den/divisor;

    def sub(othr:Rational):Rational = {
        new Rational(this.numer*othr.denom - othr.numer*this.denom, this.denom*othr.denom);
    }

    override def toString() = s"$numer/$denom";
}

object Q2 extends App{
    var x = new Rational(3,4);
    var y = new Rational(5,8);
    var z = new Rational(2,7)
    print(x.sub(y).sub(z));
}
