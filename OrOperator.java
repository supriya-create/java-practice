import java.util.Scanner;

public class OrOperator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your username: ");
        name = sc.nextLine();
        if(name.contains(" ") || name.contains("_")){
            System.out.print("Username must not contain underscore or space");
        }
        else if(name.length()<4 || name.length()>12){
            System.out.print("Username must contain 4-12 characters only");
        }
        else{
            System.out.print("Welcome "+name);
        }
        sc.close();
    }
}
