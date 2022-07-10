import scala.io.StdIn.readInt

object Q4b extends App {
    
    def attendance(ticketPrice:Int):Int = 
    {
        120 + (15-ticketPrice)/5*20;
    }
    def totCost(participants:Int):Int = 
    {
        500+3*participants;
    }
    def totIncome(ticketPrice:Int):Int = 
    {
        ticketPrice*attendance(ticketPrice);
    }
    def profit(ticketPrice:Int):Int = 
    {
        totIncome(ticketPrice) - totCost(attendance(ticketPrice));
    }

    print("Enter the ticket price: ");
    var tPrice = readInt();
    print("Your profit is: "+profit(tPrice));
}