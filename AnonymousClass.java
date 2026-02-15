public class AnonymousClass {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){
            @Override
            void sound(){
                System.out.println("Scooby Doo says Ruh Roh.");
            }
        };

        dog1.sound();
        dog2.sound();
    }
}
