public class MyRunnables implements Runnable {
    
    private final String text;

    MyRunnables(String text){
        this.text = text;
    }

    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            try{
                Thread.sleep(1000);
                System.out.println(this.text);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted.");
            }
        }
    }
}
