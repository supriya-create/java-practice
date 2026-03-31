interface Greeting{
    void sayHello();
}
public class AnonymousClass2 {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
           public void sayHello(){
                System.out.println("Hello!!");
            }
        };
        g.sayHello();
    }
}
