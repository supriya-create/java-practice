import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] foods;
        int size;
        System.out.print("Enter the number of food you want: ");
        size = sc.nextInt();
        sc.nextLine();

        foods = new String[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter the food: ");
            foods[i] = sc.nextLine();
        }
        for(String food : foods){
            System.out.println(food);
        }
        sc.close();
    }
}
