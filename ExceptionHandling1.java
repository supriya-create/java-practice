import java.util.Scanner;

public class ExceptionHandling1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int x = sc.nextInt();
        try{
            int a = x/0;
            System.out.println(a);
        }catch(Exception e){
            System.out.println("Cannot divide by 0");
        }
        sc.close();
    }
}
