class Animal{}
class Cat extends Animal{}
public class ParentReference {
    public static void main(String[] args) {
        Animal a = new Cat();
        System.out.println(a instanceof Animal);
        System.out.println(a instanceof Cat);
    }
}
