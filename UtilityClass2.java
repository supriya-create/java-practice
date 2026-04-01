class StringUtil{
    private StringUtil() {}
    static String reverse(String str){
        return new StringBuilder(str).reverse().toString();
    }
    static boolean isPalindrome(String str){
        return str.equals(reverse(str));
    }
}
public class UtilityClass2 {
    public static void main(String[] args) {
        System.out.println(StringUtil.reverse("Hello"));
        System.out.println(StringUtil.isPalindrome("madam"));
    }
}
