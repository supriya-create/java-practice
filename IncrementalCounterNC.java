import java.util.*;
public class IncrementalCounterNC {
    private int count = 0;

    void increment() {
        this.count++;   // using 'this'
    }

    int getCount() {
        return this.count;   // using 'this'
    }
}
class MainApp {
    public static void main(String[] args) {
        IncrementalCounterNC counter = new IncrementalCounterNC();
        Scanner scanner = new Scanner(System.in);

        int numIncrements = scanner.nextInt();

        for (int i = 0; i < numIncrements; i++) {
            counter.increment();
        }

        System.out.println("Final Count: " + counter.getCount());
        scanner.close();
    }
}