public class Abstraction {
    public static void main(String[] args){

        Circles circles = new Circles(4);
        Triangle triangle = new Triangle(10,7);
        Rectangle rectangle = new Rectangle(6,8);

        circles.display();
        triangle.display();
        rectangle.display();

        System.out.println(circles.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}
