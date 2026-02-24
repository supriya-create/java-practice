public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;
        int i = 1;
        do{
            fact*=i;
            i++;
        }while(i<=num);
        System.out.println(fact);
    }
}
