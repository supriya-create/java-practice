import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int rev =0;
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        while(num!=0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        System.out.println("Reversed number: "+rev);
        sc.close(); 
    }
}
