// Nick is tasked with developing a Text Replacement Engine that replaces all occurrences of a specified substring in a given text. The engine should take the original text, the substring to be replaced, and the replacement string as input and output the modified text after performing the replacement.



// Help Nick complete the task of implementing text replacement for efficient string manipulation using the StringBuilder class

import java.util.Scanner;

public class ReplaceStringNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the inputs: ");
        String org = sc.nextLine();
        String rep = sc.nextLine();
        String add = sc.nextLine();
        StringBuilder sb = new StringBuilder(org);
        int index = sb.indexOf(rep);
        while(index!=-1){
            sb.replace(index, index + rep.length(), add);
            index = sb.indexOf(rep, index + add.length());
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
