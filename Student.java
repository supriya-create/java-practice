public class Student {
    String name;
    int age;
    double cgpa;
    boolean isStudent = true;

    Student(String n, int a, double c){
        name = n;
        age = a;
        cgpa =  c;
    }

    void study(){
        System.out.println(this.name+" is studying");
    }
}
