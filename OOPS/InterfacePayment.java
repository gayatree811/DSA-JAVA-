package OOPS;
interface payment{
    void pay(double amount);
}

class upi implements payment{
    public void pay(double amount){
        System.out.println("paid" + amount + "using upi");
    }
}
class creditcard implements payment{
    public void pay(double amount){
        System.out.println("paid" + amount + "using credit card");
    }
}
class cash implements payment{
    public void pay(double amount){
        System.out.println("paid" + amount + "using cash");
    }
}

public class InterfacePayment {
    public static void main(String[] args) {

        payment p ;
        p= new upi();
        p.pay(5000);

        p = new creditcard();
        p.pay(1000);

        p = new cash();
        p.pay(203);
        
    }
}
