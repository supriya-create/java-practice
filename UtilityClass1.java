class MathUtil{
    private MathUtil(){}

    static int add(int a, int b){
        return a+b;
    }
    static int multiply(int a, int b){
        return a*b;
    }
    static int subtract(int a, int b){
        return a-b;
    }
    static int division(int a, int b){
        return a/b;
    }
}
public class UtilityClass1 {
    public static void main(String[] args) {
        System.out.println(MathUtil.add(8,9));
        System.out.println(MathUtil.multiply(10, 8));
        System.out.println(MathUtil.subtract(46, 8));
        System.out.println(MathUtil.division(10, 2));
    }
}
