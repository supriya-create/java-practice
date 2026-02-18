// Alex is fascinated by mountains and valleys. He defines a peak element as an element that is strictly greater than its neighbours. 



// Given an array of integers, help Alex find a peak element and its index.

// Input format :
// The first line of input consists of an integer N, representing the size of the array.

// The second line consists of N space-separated integers, representing the elements of the array.

// Output format :
// The output prints "Peak Element: X at index Y" where X and Y are integers representing the peak element and index of the peak element (index starts from 0)



// Refer to the sample output for formatting specifications.

// Code constraints :
// The given testcases fall under the following constraints:

// 1 ≤ N ≤ 10

// 0 ≤ array elements ≤ 100

// Sample test cases :
// Input 1 :
// 5
// 1 3 20 4 1
// Output 1 :
// Peak Element: 20 at index 2
// Input 2 :
// 4
// 7 4 3 8
// Output 2 :
// Peak Element: 8 at index 3

import java.util.Scanner;

public class ArrayNC {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int peakval = -1;
        int peakind = -1;

        for(int i = 0; i < n; i++){

            if(i == 0){
                if(n == 1 || arr[i] > arr[i+1]){
                    if(arr[i] > peakval){
                        peakval = arr[i];
                        peakind = i;
                    }
                }
            }
            else if(i == n-1){
                if(arr[i] > arr[i-1]){
                    if(arr[i] > peakval){
                        peakval = arr[i];
                        peakind = i;
                    }
                }
            }
            else{
                if(arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                    if(arr[i] > peakval){
                        peakval = arr[i];
                        peakind = i;
                    }
                }
            }
        }

        if(peakval != -1){
            System.out.print("Peak Element: " + peakval + " at index " + peakind);
        }
        sc.close();
    }
   
}
