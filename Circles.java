public class Circles extends Shape{
    double radius;

    Circles(double radius){
        this.radius = radius;
    }

    @Override
    double area(){
        return Math.PI * radius *radius;
    }
}
