public class Variable {
    public static void main(String[] args){
        int age = 19;
        double cgpa = 7.41;
        char grade = 'A';
        String name = "Supriya";

        System.out.println("Hello " + name);
        System.out.println("The cgpa is " + age);
        System.out.println("The year is " + cgpa);
        System.out.println("The grade is " + grade);

        System.out.println("Your name is " + name +" and your age is "+ age+ " ");
        boolean isStudent = true;
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

    }
}
