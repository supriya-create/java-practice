class Outer{
    int a = 10;
    class Inner{
        int a = 20;
        void display(){
            System.out.println(a);
            System.out.println(Outer.this.a);
        }
    }
}
public class InnerNestedClass1{
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner in = obj.new Inner();
        in.display();
    }
}