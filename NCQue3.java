import java.util.Scanner;

public class NCQue3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] freq = new int[256];

        while (sc.hasNextLine()) {
            String line = sc.nextLine();

            for (int i = 0; i < line.length(); i++) {   // ✅ FIX HERE
                char ch = line.charAt(i);

                if (Character.isLetter(ch)) {
                    freq[ch]++;
                }
            }
        }

        System.out.println("Character Frequency Count:");

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {   // ✅ print only used characters
                System.out.println((char)i + " - " + freq[i]);
            }
        }
    }
}
