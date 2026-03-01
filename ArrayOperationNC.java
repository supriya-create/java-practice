import java.util.Scanner;

public class ArrayOperationNC {
    int[] arr;
    int n;
    {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
    }
    public int sum(){
        int sum =0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public double avg(){
        return (double)sum()/n;
    }
    public int max(){
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public void displayArrayOperations(){
        System.out.println("Sum: "+sum());
        System.out.println("Average: "+avg());
        System.out.println("Maximum: "+max());
    }
    public static void main(String[] args) {
        ArrayOperationNC intArrayCalculator = new ArrayOperationNC();
        intArrayCalculator.displayArrayOperations();
    }
}
