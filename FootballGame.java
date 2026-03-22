abstract class Game{
    final void start(){
        System.out.println("Game Started");
    }
    abstract void play();
    final void end(){
        System.out.println("Game ended");
    }
}
class Football extends Game{
    void play(){
        System.out.println("Playing football...");
    }
}
public class FootballGame {
    public static void main(String[] args) {
    Game f = new Football();
    f.start();
    f.play();
    f.end();
    }
}
