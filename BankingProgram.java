import java.util.Scanner;

public class BankingProgram {
   public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        double balance = 1000;
        int choice;
        boolean isRunning = true;
        
        while (isRunning) {
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("****************");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Choice");
            }
        }
        System.out.printf("Your balance: ₹%.2f%n", balance);
        System.out.println("****************");
        System.out.println("Thank you! Have a nice day!");
        sc.close();

    }
    static void showBalance(double balance){
        System.out.printf("%f\n", balance);
    }
    static double deposit(){
        
        System.out.println("Enter the amount to be deposited: ");
        double amount = sc.nextDouble();
        if(amount<0){
            System.out.println("Amount cannot be negative.");
            return 0;
        }
        else{
            return amount;
        }
    }

    static double withdraw(double balance){
        double amount;
        System.out.print("Enter the amount to be withdrawn: ");
        amount = sc.nextDouble();
        if(amount>balance){
            System.out.print("INSUFFICIENT FUND");
            return 0;
        }
        else if(amount<0){
            System.out.print("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }
}
