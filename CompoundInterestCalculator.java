import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double principle;
        double rate;
        int time;
        int year;
        double amount;

        System.out.print("Enter the principal: ");
        principle = sc.nextDouble();

        System.out.print("Enter the interest rate: ");
        rate = sc.nextDouble();

        System.out.print("Enter the compounded time: ");
        time = sc.nextInt();

        System.out.print("Enter the year: ");
        year = sc.nextInt();
        rate = rate/100;
        amount = principle * Math.pow(1+rate/time, time*year);

        System.out.printf("The compound interest is Rs.%.2f\n", amount);
        sc.close();
    }
}
