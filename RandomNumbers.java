import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int number1;
        double number2;
        boolean isHead;

        number1=random.nextInt(1,101);
        number2=random.nextDouble(7.0,9.0);
        isHead=random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        if(isHead){
            System.out.println("HEAD");
        }
        else{
            System.out.println("TAIL");
        }

        
    }
}
