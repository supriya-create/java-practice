import java.util.Scanner;
public class MadLibGame {
    public static void main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        String name;
        String place;
        int number;
        String adjective;
        String animal;

        System.out.print("Enter a name: ");
        name = scanner.nextLine();
        System.out.print("Enter a place: ");
        place = scanner.nextLine();
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter a adjective: ");
        adjective=scanner.nextLine();
        System.out.print("Enter a animal: ");
        animal = scanner.nextLine();
        
        System.out.println(name+" went to "+place+" with "+number+" friends.");
        System.out.println("They saw a very "+adjective+" "+ animal+".");
        System.out.println("It was an unforgetable day!");

        scanner.close();
    }
}
