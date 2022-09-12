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

    def neg = new Rational(-this.num,this.den)

    override def toString() = s"$numer/$denom";
}

object Q1 extends App{
    var rat1 = new Rational(3,7);
    print(rat1.neg);
}
