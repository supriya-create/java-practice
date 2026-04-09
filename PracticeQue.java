import java.util.*;
abstract class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    abstract void displayDetails();
}
interface Taxable{
    double calculateTax();
}
class InvalidSalaryException extends Exception{
    InvalidSalaryException(String message){
        super(message);
    }
}
class Employee extends Person implements Taxable{
    int employeeid;
    double salary;
    Employee(String name, int age, int employeeid, double salary) throws InvalidSalaryException{
        super(name, age);
        if(salary<0){
            throw new InvalidSalaryException("Salary can't be negative");
        }
        this.employeeid = employeeid;
        this.salary = salary;
    }
    void displayDetails(){
        System.out.println("Employee Details: ");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+employeeid);
        System.out.println("Salary: "+salary);
    }
    public double calculateTax(){
        return 0.1*salary;
    }
    public String toString(){
        return "["+"EmployeeId: "+employeeid+" Name: "+name+" Salary: "+salary+"]";
    }
    public boolean equals(Object obj){
        if(this==obj) return true;
        if(obj==null||getClass()!=obj.getClass()) return false;

        Employee e = (Employee) obj;
        return this.employeeid == e.employeeid;
    }
    static class Department{
        String dept;
        Department(String dept){
            this.dept = dept;
        }
        void display(){
            System.out.println("Department: "+dept);
        }
    }
}

public class PracticeQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            System.out.print("Enter Id: ");
            int id = sc.nextInt();

            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            Employee e1 = new Employee("Alice", 30, 1, 10000);
            Employee e2 = new Employee("Bob", 29, 2, 15000);

            e1.displayDetails();
            System.out.println(e1.calculateTax());

            System.out.println(e1);

            System.out.println("Are employees equal? "+e1.equals(e2));

            Employee.Department obj = new Employee.Department("IT");
            obj.display();

            Taxable t = new Taxable() {
                public double calculateTax(){
                    return 2000;
                }
            };
            System.out.println("Anonymous Tax Calculation: "+t.calculateTax());

        }catch(InputMismatchException e){
            System.out.println("Invalid input!");
        }catch(InvalidSalaryException e){
            System.out.println("Custom exception: " +e.getMessage());
        }finally{
            System.out.println("Program executed");
            sc.close();
        }
    }
}
