class Company{
    static class Employee{
        String name;
        int id;
        Employee(String name, int id){
            this.name = name;
            this.id = id;
        }
        void show(){
            System.out.println("Employee Name: "+this.name+" ID: "+this.id);
        }
    }
}
public class CompanyNestedClass {
    public static void main(String[] args) {
        Company.Employee e1 = new Company.Employee("Supriya", 101);
        Company.Employee e2 = new Company.Employee("Will Byers", 102);
        e1.show();
        e2.show();
    }
}
