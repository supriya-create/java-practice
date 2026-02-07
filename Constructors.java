public class Constructors {
    public static void main(String[] args){
        Student student1 = new Student("Will Byers", 24, 8.9);
        Student student2 = new Student("Steve Harington", 29, 7.5);
        Student student3 = new Student("Max", 24, 9.3);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.cgpa);
        System.out.println(student1.isStudent);
        student1.study();
        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.cgpa);
        System.out.println(student2.isStudent);
        student2.study();
        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.cgpa);
        System.out.println(student3.isStudent);
        student3.study();
        System.out.println();

    }
}
