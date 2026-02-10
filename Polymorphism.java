public class Polymorphism {
    public static void main(String[] args){

        Bus bus = new Bus();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = {bus, boat, bike};

        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }
    }
}
