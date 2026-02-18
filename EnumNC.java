// Harry is developing a graphics application that allows users to calculate the area of different shapes. Users can input the shape type (either SQUARE or TRIANGLE) and relevant dimensions. 



// The task is to write a program to accommodate the SQUARE and TRIANGLE shapes in the enum Shape to find the area of squares and triangles.



// Formula :

// Area of square = sideLength * sideLength

// Area of triangle = 0.5 * base * height

// Input format :
// The first line of input consists of a string, representing the shape (SQUARE or TRIANGLE).

// If the shape is 'SQUARE', the second line consists of double value a, representing the side of the square.

// If the shape is 'TRIANGLE', the second line consists of two double values b and h, representing the base and height of the triangle, respectively.

// Output format :
// If the shape type is valid, print the area of the shape (rounded to 2 decimal place).

// If the shape type is invalid, print "Invalid Input".



// Refer to the sample output for formatting specifications.

// Code constraints :
// The input is case-insensitive.

// 0.1 ≤ a , b , h ≤ 100.0

// Sample test cases :
// Input 1 :
// SqUARe
// 5.5
// Output 1 :
// 30.25
// Input 2 :
// CIRCLE
// Output 2 :
// Invalid Input
// Input 3 :
// TRIANGLE
// 4.0
// 6.0
// Output 3 :
// 12.00

import java.util.Scanner;

enum Shape{
    TRIANGLE, SQUARE;
}
public class EnumNC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine().toUpperCase();
        if(type.equals("TRIANGLE")){
            double b = sc.nextDouble();
            double h = sc.nextDouble();
            System.out.printf("%.2f", 0.5*b*h);
        }
        else if(type.equals("SQUARE")){
            double a = sc.nextDouble();
            System.out.printf("%.2f", a*a);
        }
        else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
