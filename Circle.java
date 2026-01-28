import java.util.Scanner;

public class Circle {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double r;
        double circum;
        double area;
        double vol;
        System.out.print("Enter the radius: ");
        r=sc.nextDouble();

        circum = 2 * Math.PI * r;
        area = Math.PI * Math.pow(r, 2);
        vol = (4.0/3.0) * Math.PI * Math.pow(r, 2);

        System.out.printf("The circumference of circle is: %.1fcm\n",circum);
        System.out.printf("The area of circle is: %.1fcm²\n",area);
        System.out.printf("The volume of circle is: %.1fcm²\n",vol);
        sc.close();
    }
}
