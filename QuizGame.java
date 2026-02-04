import java.util.Scanner;

public class QuizGame {
    public static void main(){
        Scanner sc = new Scanner(System.in);
        String[] ques = {"Which part of computer is considered brain of computer?",
                         "Which property does stack follows?" , "Which property does queue follows?",
                         "What does linked list store?"};

        String[][] options = {{"1.CPU", "2.GPU", "3.RAM", "4.ROM"},
                          {"1.LIFO", "2.FIFO", "3.Both", "4.None"},
                          {"1.LIFO", "2.FIFO", "3.Both", "4.None"},
                          {"1.Data", "2.Address", "3.Both", "4.None"}};
        
        int guess;
        int[] ans = {1,2,3,4};
        int score = 0;

        System.out.println("--------------------------");
        System.out.println("Welcome to java quiz game");
        System.out.println("--------------------------");

        for(int i=0;i<ques.length;i++){
            System.out.println(ques[i]);
            for(String option: options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if(guess==ans[i]){
                System.out.println("--------");
                System.out.println("CORRECT!");
                System.out.println("--------");
                score++;
            }
            else{
                System.out.println("--------");
                System.out.println(" WRONG!");
                System.out.println("--------");
            }
        }
        System.out.print("You score is: "+score+" out of "+ques.length);
        sc.close();;
    }
}
