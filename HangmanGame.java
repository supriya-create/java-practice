import java.util.ArrayList;
import java.util.Scanner;

public class HangmanGame {
    public static void main(String[] args) {
        String word = "Apple";

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordstate = new ArrayList<>();
        int wrongGuess = 0;
        
        for(int i=0; i<word.length(); i++){
            wordstate.add('_');
        }

        System.out.println("------------------------");
        System.out.println("Welcome to Hangman Game");
        System.out.println("------------------------");

        
        while (wrongGuess < 6) {

    System.out.print(getHangmanArt(wrongGuess));
    System.out.print("Word: ");

    for (Character c : wordstate) {
        System.out.print(c + " ");
    }
    System.out.println();

    System.out.print("Guess a letter: ");
    char guess = sc.next().toLowerCase().charAt(0);

    if (word.toLowerCase().indexOf(guess) >= 0) {
        System.out.println("Correct Guess\n");

        for (int i = 0; i < word.length(); i++) {
            if (Character.toLowerCase(word.charAt(i)) == guess) {
                wordstate.set(i, word.charAt(i));
            }
        }
    } 
    else {
        wrongGuess++;
        System.out.println("Wrong Guess\n");
    }

    // WIN CHECK
    if (!wordstate.contains('_')) {
        System.out.print(getHangmanArt(wrongGuess));
        System.out.println("YOU WIN!");
        System.out.println("The word was " + word);
        break;
    }
}

// LOSE CHECK
if (wrongGuess >= 6) {
    System.out.print(getHangmanArt(wrongGuess));
    System.out.println("GAME OVER");
    System.out.println("The word was: " + word);
}

        sc.close();
    }
    static String getHangmanArt(int wrongGuess){

        return switch (wrongGuess){
          case 0 ->"""
                  


                   """;

           case 1 -> """
                      o


                     """;
            case 2 -> """
                      o
                      |

                     """;
            case 3 -> """
                      o
                     /|

                     """;
            case 4 -> """
                      o
                     /|\\

                     """;
            case 5 -> """
                      o
                     /|\\
                     /
                     """;
            case 6 -> """
                      o
                     /|\\
                     /  \\
                     """;
            default-> "";
            
        }; 
    }
}
