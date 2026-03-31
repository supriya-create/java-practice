import java.util.function.Predicate;

public class PredicateFI {
public static void main(String[] args) {
    Predicate<Integer> obj = (n) -> n%2==0;
    System.out.println(obj.test(9));
}    
}
