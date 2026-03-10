import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double width=0;
        double height=0;
        double area=0;

        System.out.print("Enter width: ");
        width = sc.nextDouble();

        System.out.print("Enter height: ");
        height = sc.nextDouble();

        area = width*height;

        System.out.println("The arrea of rectangle is "+ area);

        sc.close();;
    }
}
