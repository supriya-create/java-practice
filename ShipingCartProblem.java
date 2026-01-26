import java.util.Scanner;
public class ShipingCartProblem {
    public static void main(String[] arg){
        String item;
        int quantity;
        int price;
        int total;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to order?: ");
        item = scanner.nextLine();
        System.out.print("What is price of each?: ");
        price=scanner.nextInt();
        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("You have bought "+quantity+" "+ item);
        System.out.println("Your total is Rs."+total );
        scanner.close();
    }
}
