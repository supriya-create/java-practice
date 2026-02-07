public class Vehical {
    String model;
    String color;

    Vehical(String m, String c){
        model = m;
        color = c;
    }
    void drive(){
        System.out.println("You are driving "+color+" "+model);
    }
}
