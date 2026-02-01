import java.util.Random;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] arg){
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int guess;
        int attempts = 0;
        int min =1;
        int max =100;
        int randomNum = random.nextInt(min, max+1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n", min,max);

        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;
            if(guess>randomNum){
                System.out.println("TOO HIGH! Try again");
            }
            else if(guess<randomNum){
                System.out.println("TOO LOW! Try again");
            }
            else{
                System.out.printf("CORRECT GUESS!! The number was %d\n",randomNum);
                System.out.print("Total number of attempts is "+attempts);
            }
        }while(randomNum != guess);


        sc.close();
    }
}
