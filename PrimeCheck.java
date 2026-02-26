import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isprime = true;

        if(num<=1){
            isprime = false;
        }
        else{
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    isprime = false;
                    break;
                }
            }
        }

        if(isprime){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
        sc.close();
    }
}
