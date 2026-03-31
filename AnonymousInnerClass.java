abstract class Animal{
    abstract void sound();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Animal a = new Animal() {
            void sound(){
                System.out.println("Dog barks");
            }
        };
        a.sound();
    }
}
