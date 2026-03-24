interface Payment{
    void pay(double amount);
}
class Card implements Payment{
    public void pay(double amount){
        System.out.println("₹"+amount+" paid using Credit Card");
    }
}
class UPI implements Payment{
    public void pay(double amount){
        System.out.println("₹"+amount+" paid using UPI");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment p1 = new Card();
        p1.pay(500);
        Payment p2 = new UPI();
        p2.pay(1000);
    }
}
