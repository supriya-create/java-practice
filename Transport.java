abstract class Trans{
    abstract void start();
    abstract void stop();
    abstract double fair(int dist);
}
class Bus extends Trans{
    void start(){
        System.out.println("Bus Started!!");
    }
    void stop(){
        System.out.println("Bus Stopped!!");
    }
    double fair(int dist){
        return dist*5;
    }
}
class Train extends Trans{
    void start(){
        System.out.println("Train started!!");
    }
    void stop(){
        System.out.println("Train Stopped!!");
    }
    double fair(int dist){
        return dist*8;
    }
}
class Auto extends Trans{
    void start(){
        System.out.println("Auto started!!");
    }
    void stop(){
        System.out.println("Auto stopped!!");
    }
    double fair(int dist){
        return dist * 4;
    }
}
public class Transport {
    public static void main(String[] args) {
        Trans t1 = new Bus();
        Trans t2 = new Train();
        Trans t3 = new Auto();
        t1.start();
        t1.stop();
        System.out.println("Fair: "+t1.fair(5));
        t2.start();
        t2.stop();
        System.out.println("Fair: "+t2.fair(6));
        t3.start();
        t3.stop();
        System.out.println("Fair: "+t3.fair(7));
    }
}
