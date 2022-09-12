class Rational(num:Int,den:Int){

    require(den>0,"The denominator must be positive") 
    private def gcd(a: Int, b: Int): Int = {
        if(b == 0) a 
        else {
            if(a<b) gcd(b,a)
            else gcd(b, a%b)
        } 
    }

    val numer = num / gcd(num, den)
    val denom = den / gcd(num, den)

    def -(othr:Rational):Rational = {
        new Rational(this.numer*othr.denom - othr.numer*this.denom, this.denom*othr.denom);
    }

    override def toString() = numer+"/"+denom;
}

object Q2 extends App{
    var x = new Rational(3,4);
    var y = new Rational(5,8);
    var z = new Rational(2,7)
    print(x-y-z);
}