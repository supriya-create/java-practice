abstract class Payment{
    void pay(){
        autentication();
        process();
        System.out.println("Payment done!!");
    }
    abstract void autentication();
    abstract void process();
}
class card extends Payment{
    void autentication(){
        System.out.println("Authenticating via OTP...");
    }
    void process(){
        System.out.println("Processing credit card payment...");
    }
}
class UPI extends Payment{
    void autentication(){
        System.out.println("Authenticating via UPI pin...");
    }
    void process(){
        System.out.println("Processing UPI Payment...");
    }
}
public class TemplateMethodPattern {
    public static void main(String[] args) {
        Payment p1 = new card();
        p1.pay();
        Payment p2 = new UPI();
        p2.pay();
    }
}
