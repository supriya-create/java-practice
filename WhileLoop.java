import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int num =0;
        while (num <1 || num>10) {
            System.out.print("Enter a number between 1-10: ");
            num = sc.nextInt();
        }
        System.out.print("Your picked "+num);
        sc.close();
    }
}
