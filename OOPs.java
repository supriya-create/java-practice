public class OOPs {
    public static void main(String[] args){
        Car car = new Car();
        System.out.println("The make of car is "+car.make);
        System.out.println("The model of car is "+car.model);
        System.out.println("Year is : "+car.year);
        System.out.println("The price of car is "+car.price);
        car.start();
        car.stop();
        car.drive();
        car.brake();
    }
}
