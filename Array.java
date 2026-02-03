import java.util.Arrays;;
public class Array {
    public static void main(String[] args){
        String[] fruits = {"apple", "orange", "banana", "coconut" };

        int numOfFruits = fruits.length;
        fruits[0]="mango";
        Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");
        for(int i=0;i<numOfFruits; i++){
            System.out.println(fruits[i]);
        }
    }
    
}
