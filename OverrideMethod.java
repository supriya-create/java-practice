class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog barks");
    }
}
public class OverrideMethod {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
