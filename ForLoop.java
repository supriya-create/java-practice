import java.util.Scanner;

public class ForLoop {
    public static void main(String[] arg) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int count;
        System.out.print("How many seconds to countdown from?: ");
        count = sc.nextInt();

        for(int i=count; i>0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.print("HAPPY NEW YEAR🎉");

        sc.close();
    }
}
