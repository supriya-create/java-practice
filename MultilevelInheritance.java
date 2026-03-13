class Vehical{
    void start(){
        System.out.println("Vehical starts");
    }
}
class Car extends Vehical{
    void drive(){
        System.out.println("Car is driving");
    }
}
class ElectricCar extends Car{
    void charge(){
        System.out.println("Electric car charging");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();
        e.drive();
        
    }
}
