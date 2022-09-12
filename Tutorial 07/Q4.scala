class Account(id:String,accNo:String,bal:Double){
    var nic:String = id;
    var accountNo:String = accNo;
    var balance = bal;

    def transfer(toAcc:Account,bal:Double) = {
        if(this.balance>=bal){
            this.balance = this.balance-bal;
            toAcc.balance = toAcc.balance+bal;
        }else{
            println("Balance is not sufficient");
        }
    }

    override def toString() = "NIC: "+nic+" Account No: "+accountNo+" Balance: "+balance;


}

object Q4 extends App{
    var bank:List[Account] = List();

    val overDraft = (bnk:List[Account]) => bnk.filter((x:Account)=>x.balance<0)
    val totSum = (bnk:List[Account]) => bnk.reduce((x,y)=>x.balance+y.balance)

    val balWithInterest = (x:Account) => if(x.balance<0) -x.balance*100.1 else x.balance*100.05
    val finalBal = (bnk:List[Account]) => bnk.map(balWithInterest)

}
