import java.util.Comparator;

public class ComparatorFI {
    public static void main(String[] args) {
        Comparator<Integer> obj = (a,b) -> a-b;
        System.out.println(obj.compare(10, 8));
    }
}
