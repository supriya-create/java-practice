// Meteorologist Seetha is a weather expert who uses method overloading for data manipulation that to determine weather changes. She has a specific utility class, StringOps, that she uses to perform various string operations representing the weather condition , Seetha can either reverse a single string or concatenate two strings using this class and methods.If there are more than two strings , It should returns an "Invalid input".

import java.util.Scanner;

public class StringNC {
    public static String process(String s){
            StringBuilder sb = new StringBuilder(s);
            return sb.reverse().toString();
        }
    public static String process(String s1, String s2){
            return s1+s2;
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        String[] words = input.split(" ");
        if(words.length==1){
            System.out.println(process(words[0]));
        }
        else if(words.length==2){
            System.out.println(process(words[0], words[1]));
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }

}
