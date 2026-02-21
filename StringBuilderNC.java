// Ashok is developing a text processing utility that allows users to insert a substring into an original string at a specified position. The program takes input for the original string, the substring to insert, and the position at which to insert the substring.



// Write a program to help Ashok using the methods of the String Builder class.

import java.util.Scanner;

public class StringBuilderNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the inputs: ");
        String org = sc.nextLine();
        String sub = sc.nextLine();
        int pos = sc.nextInt();
        StringBuilder sb =new StringBuilder(org);
        sb.insert(pos, sub);
        System.out.println(sb.toString());
        sc.close();
    }
}
