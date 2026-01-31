import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.print("Enter thr day: ");
        day = sc.nextLine();
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thrusday", "Friday"->
            System.out.print("It's a week day🫠");
            case "Saturday", "Sunday"->
            System.out.print("It's weekend😋");
            default -> System.out.print(day+" is not a day");
        }
        sc.close();
    }
}
