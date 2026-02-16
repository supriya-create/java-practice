public class MyRunnable implements Runnable{
    
    @Override
    public void run(){
        for(int i=0; i<=10; i++){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.print("Thread was interrupted");
            }
            if(i==10){
                System.out.print("Time's Up!!");
                System.exit(0);
            }
        }
    }
}
