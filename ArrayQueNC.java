// obin is a tech-savvy teenager who is diving into programming. 



// He is working on a project to find special elements in an array called 'leaders.' Leaders are those exceptional elements that are greater than the sum of all the elements to their right. 



// Assist Robin in writing this program.



import java.util.Scanner;

public class ArrayQueNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i+1;j<n;j++){
                sum+=arr[j];
            }
            if(arr[i]>sum){
                System.out.println(arr[i]+" ");
            }
        }
        sc.close();
    }
}
