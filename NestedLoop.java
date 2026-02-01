import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int row;
        int col;
        char symbol;
        System.out.print("Enter the number of rows: ");
        row = sc.nextInt();
        System.out.print("Enter the number of col: ");
        col = sc.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = sc.next().charAt(0);

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(symbol+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
