public class Static {
    public static void main(String[] args){
        Friend friend1 = new Friend("Will byers");
        Friend friend2 = new Friend("Eleven");
        Friend friend3 = new Friend("Mike");
        Friend friend4 = new Friend("Steve");
        Friend friend5 = new Friend("Max");

        System.out.println(friend1.name);
        System.out.println(friend2.name);
        System.out.println(friend3.name);
        System.out.println(friend4.name);
        System.out.println(friend5.name);

        Friend.showFriend();
    }
}
