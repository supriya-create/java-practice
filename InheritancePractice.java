class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}
class Dog extends Animal{
}
public class InheritancePractice {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
