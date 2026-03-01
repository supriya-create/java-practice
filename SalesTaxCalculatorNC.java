// Preethi is working on a project to automate sales tax calculations for items in a store. She wants to create a program that takes the price of an item and the sales tax rate as input and calculates the final price of the item after applying the sales tax. 



// Write a program that handles both integer and double inputs using an overloaded method named calculateFinalPrice and print the final price of the item. 



// Formula Used: Final price = price + ((price * sales tax rate) / 100)
public class SalesTaxCalculatorNC {
    public static int calculateFinalPrice(int p, int r){
       return p + ((p*r)/100);
   }
   public static double calculateFinalPrice(double p, double r){
       return p + ((p*r)/100);
   }
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int intPrice = scanner.nextInt();
        int intTaxRate = scanner.nextInt();
        double doublePrice = scanner.nextDouble();
        double doubleTaxRate = scanner.nextDouble();
        int finalPriceInt = SalesTaxCalculatorNC.calculateFinalPrice(intPrice, intTaxRate);
        double finalPriceDouble = SalesTaxCalculatorNC.calculateFinalPrice(doublePrice, doubleTaxRate);
        System.out.println(finalPriceInt);
        System.out.format("%.2f", finalPriceDouble);
        scanner.close();
    }

