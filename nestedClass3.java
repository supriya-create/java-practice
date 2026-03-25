class Outer{
    static int x = 10;
    static class Inner{
        void display(){
            Outer obj = new Outer();
            System.out.println("Value of static variable x: "+obj.x);
        }
    }
}
public class nestedClass3 {
    public static void main(String[] args) {
        Outer.Inner obj = new Outer.Inner();
        obj.display();
    }
}
