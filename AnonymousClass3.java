class Person{
    void show(){
        System.out.println("Person class");
    };
}
public class AnonymousClass3 {
    public static void main(String[] args) {
        Person p = new Person(){
            void show(){
                System.out.println("Anonymous Class");
            }
        };
        p.show();
    }
}
