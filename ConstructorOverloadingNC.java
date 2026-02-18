// Meera is developing a simple billing system for a stationery shop.

// She wants to calculate the total cost and discounted cost of items using constructor overloading.



// The program should define a class named BillCalculator with two constructors:

//     • Constructor with one parameter: Initializes the price of a single item and assumes the quantity as 1.

//     • Constructor with two parameters: Initializes both the price of the item and the quantity purchased.



// Calculation Rules



// Total Cost = price × quantity
// If the total cost is greater than 500, apply a 10% discount
// Otherwise, no discount is applied

import java.util.*;
class BillCalculator{
    int price, quantity, cost, amount;
    BillCalculator(int price){
        this.price = price;
        this.quantity = 1;
        calculate();
    }
    BillCalculator(int price, int quantity){
        this.price = price;
        this.quantity = quantity; 
        calculate();
    }
    private  void calculate(){
        cost = price * quantity;
        if(cost>500){
            amount = cost - (cost*10/100);
        }
        else{
            amount = cost;
        }
    }
    
    public  int getTotalCost(){
        return cost;
    }
    public  int getFinalAmount(){
        return amount;
    }
    
}
public class ConstructorOverloadingNC {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        BillCalculator bill;

        if (sc.hasNextInt()) {
            int q = sc.nextInt();
            bill = new BillCalculator(p, q);
        } else {
            bill = new BillCalculator(p);
        }

        System.out.println(bill.getTotalCost());
        System.out.println(bill.getFinalAmount());
        sc.close();
    }

}
