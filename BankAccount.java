class Bank{
    void interest(){
        System.out.println("Bank interest");
    }
}
class Savings extends Bank{
    void interest(){
        System.out.println("Saving interest = 5%");
    }
}
class Current extends Bank{
    void interest(){
        System.out.println("Current interest = 3%");
    }
}
public class BankAccount {
    public static void main(String[] args) {
        Savings s = new Savings();
        Current c = new Current();

        s.interest();
        c.interest();
    }
}
