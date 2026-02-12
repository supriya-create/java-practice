import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print(1/0);
        }
        catch(ArithmeticException a){
            System.out.println("YOU CAN'T DIVIDE A NUMBER BY 0!!");
        }

        try{
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println(num);
        }
        catch(InputMismatchException i){
            System.out.println("That wasn't a number!!");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{
            sc.close();
            System.out.println("This always executes.");
        }
    }
}
