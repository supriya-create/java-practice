public class VariableArguments {
    public static void main(String[] args){
        System.out.println(sum(1,2,3,4,5,6));
        System.out.print(average(1,2,3,4,5,6));
    }

    static int sum(int... num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum+=i;
        }
        return sum;
    }
    static double average(int... num){
        int sum=0;
        if(num.length == 0){
            return 0;
        }
        for(int i=0;i<num.length;i++){
            sum+=i;
        }
        return sum/num.length;
    } 
}
