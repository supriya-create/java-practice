public class User {
    String name;
    String email;
    int age;

    User(){
        name = "Guest";
        email = "NOT PROVIDED";
        age = 0;
    }

    User(String n){
        name = n;
        email = "NOT PROVIDED";
        age = 0;
    }
    User(String n, String e){
        name = n;
        email = e;
        age = 0;
    }
    User(String n, String e, int a){
        name = n;
        email = e;
        age = a;
    }
}
