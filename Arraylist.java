import java.util.ArrayList;
import java.util.Scanner;
public class Arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you would like: ");
        int numOffoods = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=numOffoods; i++){
            System.out.print("Enter food number"+i+" :");
            String food = sc.nextLine();
            foods.add(food);
        }
        System.out.print(foods);
        sc.close();
    }
}
