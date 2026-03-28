class Outer{
    void display(){
        class Local{
            int x = 10;
            void show(){
                System.out.println(x);
            }
        }
        Local l = new Local();
        l.show();
    }
}
public class LocalNestedClass2 {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
    }
}
