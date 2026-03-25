class A{

    static class B{
        void display(){
            System.out.println("Inner class display method");
        }
    }
}
public class nestedClass {
    public static void main(String[] args) {
        A.B obj = new A.B();
        obj.display();
    }
}
