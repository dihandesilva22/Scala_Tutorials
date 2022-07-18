object Q3 extends App{

    def coverPagesCost(copies:Int):Double = {
        copies*24.95;
    }

    def discount(copies:Int):Double = {
        coverPagesCost(copies)*0.4;
    }

    def shippingCost(copies:Int):Double = {
        if(copies<=50){
            3.0*copies;
        }else{
            3.0*50+(copies-50)*0.75;
        }
    }

    def totCost(copies:Int):Double = {
        shippingCost(copies)+coverPagesCost(copies)-discount(copies);
    }

    printf("Wholesale cost for 60 books: %.2f",totCost(60));
}