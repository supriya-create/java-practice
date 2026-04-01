class Validator{
    private Validator(){}
    static boolean isValidAge(int age){
        return age>=18;
    }
    static boolean isValidEmail(String str){
        return str.contains("@");
    }
}
public class UtilityClass3 {
    public static void main(String[] args) {
        System.out.println(Validator.isValidAge(30));
        System.out.println(Validator.isValidEmail("supriya@123"));
    }
}
