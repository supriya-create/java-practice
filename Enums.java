import java.util.Scanner;

public class Enums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the day: ");
        String response = sc.nextLine().toUpperCase();

        try{
            Day day = Day.valueOf(response);
            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY ->
                System.out.println("It's a week day!");
                case SATURDAY, SUNDAY -> System.out.println("It's weekend!");
            }
        }
        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!");
        }
        sc.close();
    }
}
