import java.util.Scanner;

public class DiscountCalculatorNC {
    int b;
    int d;
    
    {
        Scanner sc = new Scanner(System.in);
        b = sc.nextInt();
        d = sc.nextInt();
        sc.close();
    }
    public double calculateDiscountedPrice(){
        return b - (b*d/100);
    }
    public double calculateAmountSaved(){
        return b*d/100;
    }
    public static void main(String[] args) {
        System.out.println("Enter the inputs: ");
        DiscountCalculatorNC discountCalculator = new DiscountCalculatorNC();
        double discountedPrice = discountCalculator.calculateDiscountedPrice();
        double amountSaved = discountCalculator.calculateAmountSaved();

        System.out.printf("Discounted Price: Rs. %.2f%n", discountedPrice);
        System.out.printf("Amount Saved: Rs. %.2f%n", amountSaved);
    }
}
