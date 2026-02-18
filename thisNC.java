// Create a program for Raj's Employee Information System that takes input for an employee's name, ID, and monthly salary. Utilize the Employee class with a constructor and this keyword for attribute assignments. 



// Implement methods for calculating and displaying annual salary. Collect Raj's input and display the employee details.

import java.util.Scanner;

class Employee {
   String name;
   int id;
   double salary;
   
   Employee(String name, int id, double salary){
       this.name = name;
       this.id = id;
       this.salary = salary;
   }
   public void displayEmployeeDetails(){
       System.out.println("Employee Name: "+this.name);
       System.out.println("Employee ID: "+this.id);
       System.out.printf("Monthly Salary: Rs. %.2f\n", this.salary);
       System.out.printf("Annual Salary: Rs. %.2f\n", this.salary*12);
   } 
}
public class thisNC {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int id = scanner.nextInt();

        double salary = scanner.nextDouble();

        Employee employee = new Employee(name, id, salary);
        employee.displayEmployeeDetails();
        scanner.close();
    }

}
