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

    def neg = new Rational(-this.num,this.den)

    override def toString() = numer+"/"+denom;
}

object Q1 extends App{
    var rat1 = new Rational(3,7);
    print(rat1.neg);
}
