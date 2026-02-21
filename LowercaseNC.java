// Meet Jancy, a diligent student learning to master programming. She is working on a project that requires her to process text data. Today, she needs to convert a given string to lowercase to ensure consistent and uniform text.



// Write a program that takes an input string and converts it to lowercase to help out Jancy. 

import java.util.Scanner;

public class LowercaseNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input: ");
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
        sc.close();
    }
}
