public class RunnableFI {
    public static void main(String[] args) {
        Runnable obj = () -> System.out.println("Runnable Built-in interface");
        obj.run();
    }
}
