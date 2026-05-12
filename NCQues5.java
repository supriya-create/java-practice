import java.util.Scanner;

class PalindromeChecker {
   int n;
   PalindromeChecker(int n){
       this.n = n;
   }
   boolean isPalindrome(){
       int org = n;
       int rev = 0;
       while(org>0){
           int digit = org%10;
           rev = rev*10 + digit;
           org/=10;
       }
       return rev==n;
   }
   void displayResult(){
   if(isPalindrome()){
       System.out.println("The number is a palindrome.");
   }else{
       System.out.println("The number is not a palindrome.");
   }
   }
}

class WordPalindromeChecker extends PalindromeChecker {
    String str;
    WordPalindromeChecker(String str){
        super(0);
        this.str = str;
    }
    
    boolean isPalindrome(){
    String str1 = str.toLowerCase();
    String rev = new StringBuilder(str1).reverse().toString();
    return rev.equals(str1);
    }
    
   void displayResult(){
   if(isPalindrome()){
       System.out.println("The word is a palindrome.");
   }else{
       System.out.println("The word is not a palindrome.");
   }
   }
}

public class NCQues5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        PalindromeChecker numberChecker = new PalindromeChecker(number);
        numberChecker.displayResult();

        scanner.nextLine();
        String word = scanner.nextLine();

        WordPalindromeChecker wordChecker = new WordPalindromeChecker(word);
        wordChecker.displayResult();

        scanner.close();
    }
}
