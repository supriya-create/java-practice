// Bob is curious about palindrome numbers and wants a program to check if a given integer is a palindrome. The program should take an integer input, use a class with a parameterized constructor and an initializer block to initialize values, and implement a method to check and display whether the given number is a palindrome or not.


import java.util.Scanner;

public class PalindromeChcekerNC {
    static class PalindromeChecker{
        int num;
        {
            num = 0;
        }
        PalindromeChecker(int num){
            this.num = num;
        }
        public void displayPalindromeCheckResult(){
            String original = String.valueOf(num);
            String reverse = new StringBuilder(original).reverse().toString();

            if(original.equals(reverse)){
                System.out.println(num + " is a Palindrome");
            }
            else{
                System.out.println(num+" is not a palindrome");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        PalindromeChecker palindromeChecker = new PalindromeChecker(num);

        palindromeChecker.displayPalindromeCheckResult();

        scanner.close();
    }
}

