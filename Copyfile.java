import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String args[]) 
    {
        FileInputStream input = null;
        FileOutputStream output = null;
        try {
            input = new FileInputStream("source.txt");
            output = new FileOutputStream("destination.txt");
            while ((input.available())>0) 
            {
                output.write(input.read());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Incorrect file name");
        } catch (IOException e){
            System.out.println("Correct file");
        }
    }
}
