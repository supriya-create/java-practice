import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        double result=0;
        char op;
        boolean isValid = true;
        System.out.print("Enter the first number: ");
        num1 = sc.nextDouble();
        System.out.print("Enter the second number: ");
        num2 = sc.nextDouble();
        System.out.print("Enter an operator(+,-,*,/,^): ");
        op = sc.next().charAt(0);

        switch(op){
            case '+' ->result=num1+num2;
            case '-' ->result=num1-num2;
            case '*' ->result=num1*num2;
            case '/'->{
                if(num2==0){
                    System.out.print("Cannot divide by 0");
                    isValid = false;
                }
                else{
                    result = num1/num2;
                }
            }
            case '^' -> result=Math.pow(num1,num2);
            default -> {
                System.out.print("Invalid Operator");
                isValid = false;
            }
        }
        if(isValid){
                System.out.printf("%.2f",result);
            }
        sc.close();
    }
}
