import java.util.Scanner;

public class NCQue2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lineCount = 0;
        int charCount = 0;

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            System.out.println(line);   // print line
            lineCount++;                // count line
            charCount += line.length(); // count characters
        }

        System.out.println(lineCount);
        System.out.println(charCount);
    }
}
