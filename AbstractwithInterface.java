interface SmartDevice{
    void connect();
}
abstract class Applicance{
    abstract void turnOn();
}
class TV extends Applicance implements SmartDevice{
    void turnOn(){
        System.out.println("Turning on the TV...");
    }
    public void connect(){
        System.out.println("Connecting to Wifi...");
    }
}
public class AbstractwithInterface {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.turnOn();
        tv.connect();
    }
}
