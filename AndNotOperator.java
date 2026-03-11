import java.util.Scanner;

public class AndNotOperator {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        boolean isSunny =true;
        int temp = 30;
        if(temp>15 && temp<40 || !isSunny){
            System.out.println("Weather is good!");
            System.out.println("It's a cloudy weather");
        }
        else{
            System.out.println("Weather is good!");
            System.out.println("It's a sunny weather");
        }
        sc.close();
    }
}
