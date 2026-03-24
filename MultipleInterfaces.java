interface Camera{
    void takephoto();
}
interface MusicPlayer{
    void playMusic();
}
class SmartPhone implements Camera, MusicPlayer{
    public void takephoto(){
        System.out.println("Photo taken");
    }
    public void playMusic(){
        System.out.println("Music Playing");
    }
}
public class MultipleInterfaces {
    public static void main(String[] args) {
        SmartPhone s = new SmartPhone();
        s.takephoto();
        s.playMusic();
    }
}
