import java.util.Scanner;
public class input {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your cgpa: ");
        double cgpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Your name is "+name);
        System.out.println("Your age is "+age);
        System.out.println("Your cgpa is: "+cgpa);

        if(isStudent){
            System.out.println("You are enrolled as a student.");
        }
        else{
            System.out.println("You are NOT enrolled as a student.");
        }
        scanner.close();
    }
}
