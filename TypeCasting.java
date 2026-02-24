public class TypeCasting {
    public static void main(String[] args) {
        int num = 10;
        double d = num;
        System.out.println("Implicit: "+d);

        double x = 9.05;
        int y = (int) x;
        System.out.println("Explicit: "+y);
    }
}
