// Maya is working on a text analysis project and needs to determine the length of any string input by the user. Write a program to take a string as input and print its length. 

import java.util.Scanner;

public class StringLengthNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(str.length());
        sc.close();
    }
}
