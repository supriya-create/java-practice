import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr={2,3,8,9,4,6};
        int target;
        boolean find =false;
        System.out.print("Enter the target: ");
        target = sc.nextInt();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.print("Element found at index: "+i);
                find = true;
                break;
            }
        }
        if(!find){
            System.out.print("Element not found");
        }
        sc.close();
    }
}
