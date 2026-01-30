public class NestedIf {
    public static void main(String[] arg){
        boolean isStudent = true;
        boolean isSenior = true;
        double price = 99;
        if(isStudent){
            if(isSenior){
                System.out.println("You get a student discount of 10%");
                System.out.println("You get a senior discount of 20%");
                price *= 0.7;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        else{
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else{
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }
        }
        System.out.printf("The price of ticket is Rs.%.1f",price);
    }
}
