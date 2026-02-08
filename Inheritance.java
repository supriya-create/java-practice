public class Inheritance {
    public static void main(String[] args){
        Plant plant = new Plant();
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println(animal.isAlive);
        System.out.println(plant.isAlive);
        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        plant.live();
        animal.eat();
        dog.sound();
        System.out.println(dog.lives);
        cat.sound();
        System.out.print(cat.lives);

    }
}
