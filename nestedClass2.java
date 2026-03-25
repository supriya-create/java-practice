class Outer{
    static int x = 10;
    static class Inner{
        void display(){
            System.out.println("The value of static variable of outer class is: "+x);
        }
    }
}
public class nestedClass2 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
