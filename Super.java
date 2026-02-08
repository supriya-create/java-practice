public class Super {
    public static void main(String[] args){
        Person person = new Person("Eloise", "Bridgeton");
        Students student = new Students("Penelope", "Bridgeton", 4);
        Employee employee = new Employee("Bennidict", "Bridgeton", 50000);

        person.showName();;
        student.showName();;
        employee.showName();;

        student.showgpa();
        employee.showSalary();
    }
}
