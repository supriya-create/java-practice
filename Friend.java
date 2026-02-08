public class Friend {
    static int num;
    String name;

    Friend(String name){
        this.name = name;
        num++;
    }
    static void showFriend(){
        System.out.println("You have "+num+" total friends");
    }
}
