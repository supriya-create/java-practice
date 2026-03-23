class Student{
    String name;
    int roll;
    Student(String name, int roll){
        this.name = name;
        this.roll = roll;
    }
    public String toString(){
        return "Name: "+name+" Roll No: "+roll;
    }
}
public class toStringOverriding {
    public static void main(String[] args) {
        Student s = new Student("Supriya", 7);
        System.out.println(s);
    }
}
