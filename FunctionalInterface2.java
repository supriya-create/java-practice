@FunctionalInterface
interface sum{
    int calculate(int a, int b);
}
public class FunctionalInterface2 {
    public static void main(String[] args) {
        sum s = (a, b) -> a+b;
        System.out.println(s.calculate(4, 9));
    }
}
