import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class PrintWriterClass {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter = new PrintWriter(new FileWriter(new File("hello.txt"),true));

        printWriter.println("hello world");

        printWriter.print('h');

        printWriter.append("\nthis is append method");

        printWriter.write("\nthis is write method");
        
        printWriter.close();
    }
}
