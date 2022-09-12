class Account(id:String,accNo:String,bal:Double){
    var nic:String = id;
    var accountNo:String = accNo;
    var balance = bal;

    def +(othr:Account):Account = new Account("","",this.balance+othr.balance)  
    override def toString() = "NIC: "+nic+" Account No: "+accountNo+" Balance: "+balance;


}

object Q4 extends App{
  
    var a1 = new Account("1234","ER-23123",56000);       //Sample Data
    var a2 = new Account("3453","ER-33113",96000);
    var a3 = new Account("3458","ER-34513",-10000);
    var a4 = new Account("3673","ER-38813",-1000);
    var bank:List[Account] = List(a1,a2,a3,a4);

    val overDraft = (bnk:List[Account]) => bnk.filter((x:Account)=>x.balance<0)
    val totSum = (bnk:List[Account]) => bnk.reduce((x,y)=>x+y)
    val balWithInterest = (x:Account) => if(x.balance<0) x.balance*(100.1/100) else x.balance*(100.05/100)
    val finalBal = (bnk:List[Account]) => bnk.map(balWithInterest)
  
    println(overDraft(bank))
    println(totSum(bank).balance)
    println(finalBal(bank))

}

