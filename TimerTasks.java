import java.util.Timer;
import java.util.TimerTask;
public class TimerTasks {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 4;
            @Override
            public void run(){
                System.out.println("HELLO!");
                count--;
                if(count<=0){
                    System.out.println("TASK COMPLETED.");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task, 0, 2000);

    }
}
