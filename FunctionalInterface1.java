@FunctionalInterface
interface Greetings{
    void sayHello();
}
public class FunctionalInterface1 {
    public static void main(String[] args) {
        Greetings g = () -> System.out.println("Hello");
        g.sayHello();
    }
}
