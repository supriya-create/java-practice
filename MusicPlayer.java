import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class MusicPlayer {
    public static void main(String[] args) {
        String filePath = "short1.wav";
        File file = new File(filePath);

        try(Scanner sc = new Scanner(System.in);AudioInputStream audiostream = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audiostream);
            
            String response ="";

            while(!response.equals("Q")){
                System.out.println("P: Play");
                System.out.println("S: Stop");
                System.out.println("R: Reset");
                System.out.println("Q: Quit");
                System.out.print("Enter your choice: ");
                response = sc.nextLine().toUpperCase();

                switch(response){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid Choice");
                }
            }
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio is not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access audio file.");
        }
        catch(IOException e){
            System.out.println("Something went wron");
        }
        finally{
            System.out.println("Bye!");
        }
    }
}
