class Outer{
    static class Inner{
        static void display(){
            System.out.println("Static inner class static method");
        }
    }
}
public class nestedClass4 {
    public static void main(String[] args) {
        Outer.Inner.display();
    }
}
