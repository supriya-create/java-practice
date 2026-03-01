import java.util.Scanner;

class ArrayRotatorNc {

    int[] arr;
    int n;
    int m;

    // Constructor
    ArrayRotatorNc(int[] arr, int n, int m) {
        this.arr = arr;
        this.n = n;
        this.m = m;
    }

    // Method to rotate right
    void rotateRight() {
        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i + m) % n] = arr[i];
        }

        arr = temp;   // update original array
    }

    // Method to display array
    void display() {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class ArrayRotator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        ArrayRotatorNc ar = new ArrayRotatorNc(arr, n, m);
        ar.rotateRight();
        ar.display();

        sc.close();
    }
}
