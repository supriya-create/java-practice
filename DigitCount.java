import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numver: ");
        int num = sc.nextInt();
        int count =0;
        while(num!=0){
            num = num/10;
            count++;
        }
        System.out.println("Number of digits present in number: "+count);
        sc.close();
    }
}
