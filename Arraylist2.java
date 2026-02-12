import java.util.ArrayList;
public class Arraylist2 {
    public static void main(String[] args) {
        
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Watermelon");
        fruits.add("Banana");

        fruits.remove(1);
        fruits.set(3, "Pineapple");

        System.out.println(fruits.get(3));
        System.out.println(fruits.size());
        
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}
