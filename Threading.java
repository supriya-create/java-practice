import java.util.Scanner;

public class Threading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start();

        System.out.println("You have 10 seconds to enter your name.");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Hello "+name);

        sc.close();
    }
}
