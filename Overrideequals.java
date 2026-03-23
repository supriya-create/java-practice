class Student{
    String name;
    int roll;
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public boolean equals(Object obj){
        Student s = (Student) obj;
        return this.roll == s.roll;
    }
}
public class Overrideequals {
    public static void main(String[] args) {
        Student s1 = new Student("Supriya", 15);
        Student s2 = new Student("Khushi", 12);
        System.out.println(s1.equals(s2));
    }
}
