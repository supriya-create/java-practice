import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double temp;
        double newtemp;
        String unit;
        System.out.print("Enter the temperature: ");
        temp = sc.nextDouble();
        System.out.print("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = sc.next().toUpperCase();
        newtemp = (unit.equals("C")) ? (temp-32) * 5/9 : (temp*9/5) + 32;
        System.out.printf("%.1f°%s", newtemp,unit);
        sc.close();
    }
}
