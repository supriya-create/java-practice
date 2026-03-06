class Person{
    String name = "Supriya";
}
class Student extends Person{
    String course = "CSE";
    void display(){
        System.out.println(name);
        System.out.println(course);
    }
}
public class MethodInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }

}
