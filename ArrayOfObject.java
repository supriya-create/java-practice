public class ArrayOfObject {
    public static void main(String[] args){
        Vehical[] cars = {new Vehical("Mastang", "Blue"), 
                    new Vehical("Corvette", "Red"), new Vehical("Charger", "Yellow")};

    for(Vehical car : cars){
        car.color = "black";
    }
    for(Vehical car : cars){
        car.drive();
    }
    }
}
