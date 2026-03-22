abstract class Bank{
    abstract double getInterest();
}
class SBI extends Bank{
    double getInterest(){
        return 6.5;
    }
}
class HDFC extends Bank{
    double getInterest(){
        return 7.0;
    }
}
class ICICI extends Bank{
    double getInterest(){
        return 7.5;
    }
}

public class BankInterestSystem {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Interest rate: "+b.getInterest());
        
        b = new HDFC();
        System.out.println("HDFC Interest rate: "+b.getInterest());

        b = new ICICI();
        System.out.println("ICICI Interest rate: "+b.getInterest());
    }
}
