class Outer{
    void display(){
        class Local{
            void show(){
                System.out.println("Inside Local Class");
            }
        }
        Local l = new Local();
        l.show();
    }
}
public class LocalNestedClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.display();
    }
}
