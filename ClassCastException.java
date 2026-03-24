class Animal {}
class Dog extends Animal{}
public class ClassCastException {
    public static void main(String[] args) {
        Animal a = new Dog();

        if(a instanceof Dog){
            Dog d = (Dog) a;
            System.out.println("Casting Successful!");
            System.out.println(d instanceof Animal);
        }
       
    }
}
