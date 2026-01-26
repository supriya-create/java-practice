import java.util.Scanner;
public class IfElse {
    public static void main(String[] arg){
        int age;
        String name;
        boolean isStudent;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a student?(true/false): ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("You didn't enter your name 🤡");
        }
        else{
            System.out.println("Your name is "+name+"🥰");
        }

        if(age>18){
            System.out.println("You are an adult 👩");
        }
        else if(age==18){
            System.out.println("You are a child🧒");
        }
        else{
            System.out.println("You are a baby 👶");
        }

        if(isStudent){
            System.out.println("You are a student 👩‍🎓");
        }
        else{
            System.out.println("You are not a student 🙅‍♀️");
        }

        scanner.close();
    }
}
