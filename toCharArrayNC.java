// Elisa, a language processing specialist, is working on a project that requires converting strings to character arrays. To assist her in this task, you are tasked with creating a program that converts a given string to a character array.This program will help Elisa efficiently manipulate and analyze text data by converting it into a more versatile format.

import java.util.Scanner;

public class toCharArrayNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
        System.out.print("[");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);

            if(i != arr.length-1){
                System.out.print(", ");
            }
        }
        System.out.print("]");
        sc.close();
    }
}
