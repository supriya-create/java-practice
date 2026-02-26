public class ReversedString {
    public static void main(String[] args) {
        String name = "Java";
        String rev = "";
        for(int i=name.length()-1;i>=0;i--){
            rev += name.charAt(i);
        }
        System.out.println("Reversed: "+rev);
    }
}
