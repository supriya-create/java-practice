class Shape{
    void display(){
        System.out.println("This is shape");
    }
}
class Rectangle extends Shape{
    void rectangle(){
        System.out.println("This is rectangle");
    }
}
class Circle extends Shape{
    void circle(){
        System.out.println("This is circle");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        r.rectangle();
        

        c.circle();
        c.display();
    }
}
