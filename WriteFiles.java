import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class WriteFiles {
    public static void main(String[] args) {
        String filePath = "file.txt";
        String content = """
                Letting go is difficult...
                Isn't it?
                Well, that's life.
                What can we do :)
                """;
        
        try(FileWriter writer = new FileWriter(filePath)){
            writer.write(content);
            System.out.println("File has been updated.");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file location.");
        }
        catch(IOException e){
            System.out.println("Could not write the file.");
        }
    }
}
