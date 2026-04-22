import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> lines = new ArrayList<>();
        int charCount = 0;

        // Read all lines
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            lines.add(line);
            charCount += line.length();
        }

        // Print all lines
        for (String line : lines) {
            System.out.println(line);
        }

        // Print total lines
        System.out.println(lines.size());

        // Print total characters
        System.out.println(charCount);

        sc.close();
    }
}