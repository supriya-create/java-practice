import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        System.out.print("Enter the length of side A: ");
        a = sc.nextDouble();
        System.out.print("Enter the length of side B: ");
        b = sc.nextDouble();
        double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.print("The hypotenuse (side c) is: " + c);
        sc.close();
    }
}
