abstract class Employee{
    String name;

    Employee(String name){
        this.name = name;
    }
    abstract double Salary();
}
class Fulltime extends Employee{
    double sal;
    Fulltime(String name, int sal){
        super(name);
        this.sal = sal;
    }
    double Salary(){
        return sal;
    }
}
class Parttime extends Employee{
    int time;
    double sal;
    Parttime(String name, int time, double sal){
        super(name);
        this.time = time;
        this.sal = sal;
    }
    double Salary(){
        return time*sal;
    }
}
public class EmployeeSalary {
    public static void main(String[] args) {
    Employee e1 = new Fulltime("Supriya", 50000);
    Employee e2 = new Parttime("Supriya", 2, 4000);
    System.out.println(e1.name+" Salary: "+e1.Salary());
    System.out.println(e1.name+" Salary: "+e2.Salary());   
    }
}
