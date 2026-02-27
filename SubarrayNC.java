// Emily runs a bakery and tracks the monthly profits and losses of her business over a period of time. She wants to calculate her maximum net profit by removing one continuous subarray (one or more consecutive months) with the highest loss (i.e., the subarray with the smallest sum).



// However:

// If all months have only one loss, no subarray is removed.
// Otherwise, she removes the continuous subarray with the most significant loss, and the rest of the months contribute to the net profit.


// Your task is to help Emily determine the maximum possible net profit she can achieve after following these rules.

import java.util.Scanner;

public class SubarrayNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int total = arr[0];
        int mincurr = arr[0];
        int minglobal = arr[0];
        for(int i = 1; i<n;i++){
            total+=arr[i];
            mincurr = Math.min(arr[i], mincurr+arr[i]);
            minglobal = Math.min(minglobal, mincurr);
        }
        if(total==minglobal){
            System.out.println(total);
        }
        else{
            System.out.println(total-minglobal);
        }
        sc.close();
    }
}
