public class TernaryOperator {
    public static void main(String[] arg){
        int num =13;
        String isEvenOdd = (num%2==0) ? "EVEN" : "ODD";
        System.out.println(isEvenOdd);

        int hours=14;
        String isHours = (hours<12) ? "A.M" : "P.M";
        System.out.println(isHours);

        double tax = 80000;
        double taxRate = (tax>=50000) ? 0.15 : 0.5;  
        System.out.println(taxRate);
    }
}
