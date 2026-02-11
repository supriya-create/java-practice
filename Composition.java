public class Composition {
    public static void main(String[] args) {
        
        CarParts carParts = new CarParts("BMW", 2020, "V8");

        System.out.println(carParts.model);
        System.out.println(carParts.year);
        System.out.println(carParts.engine.type);

        carParts.start();
        carParts.engine.start();
    }
}
