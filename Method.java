public class Method {
    public static void main(String[] args){
        String name = "Noah";
        int age = 20;
        happyBirthday(name, age);

        System.out.println(square(6));

        System.out.println(fullName("Will", "Byers"));

        if(ageCheck(age)){
            System.out.println("You can sign up.");
        }
        else{
            System.out.print("You can't sign up!");
        }

    }
    static void happyBirthday(String name , int age){
        System.out.println("Happy Birthday " +name);
        System.out.printf("You are %d years old\n", age);
    }
    static double square(int num){
        return num*num;
    }
    static String fullName(String first, String last) {
        return first+" "+last;
    }
    static boolean ageCheck(int age){
        if(age>=18){
            return true;
        }
        else{
            return false;
        }
    }
}
