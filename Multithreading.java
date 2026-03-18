public class Multithreading {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnables("PING"));
        Thread thread2 = new Thread(new MyRunnables("PONG"));

        System.out.println("GAME START!!");

        thread1.start();
        thread2.start();

        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
        }

        System.out.println("GAME OVER!!");
    }
}
