import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] choice = {"rock", "paper", "scissors"};
        String userchoice;
        String compchoice;
        String again = "yes";

        do{
            System.out.print("Enter your move(rock, paper, scissors): ");
            userchoice = sc.nextLine();
            if(!userchoice.equals("rock") && !userchoice.equals("paper") && !userchoice.equals("scissors")){
                System.out.print("Invalid Choice");
                continue;
            }

            compchoice = choice[random.nextInt(3)];
            System.out.println("Computer choice: "+compchoice);

            if(userchoice.equals(compchoice)){
                System.out.println("It's a tie!!");
            }
            else if(userchoice.equals("rock") && compchoice.equals("scissors") ||
                    userchoice.equals("paper") && compchoice.equals("rock") ||
                    userchoice.equals("scissors") && compchoice.equals("paper")){
                System.out.println("YOU WIN!!");
            }
            else{
                System.out.println("YOU LOSE!!");
            }

            System.out.print("Play Again(yes/no): ");
            again = sc.nextLine();

        }while(again.equals("yes"));

        System.out.print("Thanks for playing.");
        sc.close();
    }
}
