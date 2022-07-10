import scala.io.StdIn.readInt

object Q4a extends App {

    def normalPay(hrs:Int):Int = 
    {
        hrs*250;
    }
    def OTPay(hrs:Int):Int = 
    {
        hrs*85;
    }
    def totSalary(noHrs:Int,OTHrs:Int):Int = 
    {
        normalPay(noHrs)+OTPay(OTHrs);
    }
    def totTax(noHrs:Int,OTHrs:Int):Double = 
    {
        totSalary(noHrs,OTHrs)*0.12;
    }
    def takeHomeSalary(noHrs:Int,OTHrs:Int):Double = 
    {
        totSalary(noHrs,OTHrs) - totTax(noHrs,OTHrs); 
    }

    print("Enter the number of normal working hours: ");
    var normalHrs = readInt();
    print("Enter the number of OT working hours: ");
    var otHrs = readInt();
    print("Take home salary is: "+takeHomeSalary(normalHrs,otHrs));
}
