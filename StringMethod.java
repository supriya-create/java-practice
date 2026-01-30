public class StringMethod {
    public static void main(String[] arg){
        String name = "   Will Byers  ";
        
        //int length = name.length();
        //char letter = name.charAt(2);
        //int index = name.indexOf("l");
        //int lastIndex = name.lastIndexOf("y");

        name = name.toUpperCase();
        //name = name.toLowerCase();
        name = name.trim();
        //name = name.replace("B", "W");
        
        if(name.isEmpty()){
        System.out.print("Your name is Empty");
        }
        else{
            System.out.println("Your name is not empty");
        }

        if(name.equalsIgnoreCase("pass")){
            System.out.println("Your name can't be pass");
        }
        else{
            System.out.println("Hello "+name);
        }
    }
}
