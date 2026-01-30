import java.util.Scanner;

public class Substring {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        String email;
        String username;
        String domain;
        System.out.print("Enter email id: ");
        email = sc.nextLine();
        if(email.contains("@")){
        username = email.substring(0, email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1);
        System.out.println("Username: "+username);
        System.out.println("Domain: "+domain);
        }
        else{
            System.out.print("Your email is not valid!");
        }
        sc.close();
    }
}
