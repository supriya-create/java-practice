class University{
    static String uni = "LPU";
    static class Department{
        String dept;
        Department(String dept){
            this.dept = dept;
        }
        void display(){
            System.out.println("University Name: "+uni+" Department: "+this.dept);
        }
    }
}
public class UniversityNestedClass {
    public static void main(String[] args) {
        University.Department u = new University.Department("CSE");
        u.display();
    }
}
