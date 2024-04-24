import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Handle FileNotFoundException
        try {
            File file = new File("nonexistent.txt");
            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        // Handle ClassNotFoundException
        try {
            Class<?> cls = Class.forName("java.lang.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
        // Handle InterruptedException
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }
        // Handle IndexOutOfBoundsException
        try {
            int[] array = new int[5];
            int number = array[10];  
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds: " + e.getMessage());
        }
        // Handle NullPointerException
        try {
            String text = null;
            int length = text.length();  
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception: " + e.getMessage());
        }
        // Handle ArithmeticException
        try {
            int result = 10 / 0;  
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception (divide by zero): " + e.getMessage());
        }
        try {
            simulateIOOperation();
        } catch (IOException e) {
            System.out.println("General I/O exception: " + e.getMessage());
        }
    }
    private static void simulateIOOperation() throws IOException {
        if (System.currentTimeMillis() % 2 == 0) {  
            throw new IOException("Simulated I/O failure");
        }
        System.out.println("I/O Operation Successful");
    }
}
