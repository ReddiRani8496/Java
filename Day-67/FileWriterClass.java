import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
public class FileWriterClass {
    public static void main(String[] args) throws IOException {  

        File file = new File("mock.txt");

        FileWriter fileWriter = new FileWriter(file);

      //  fileWriter.write("mock is text file");

        fileWriter.write("welcome"); // the previous content will be overriden, to overcome this problem append method is used

        FileWriter fileWriter1 = new FileWriter(file,true); // here true specifies the content to be appended

        fileWriter.write(" to mock");

        fileWriter1.append("\n mock is text file"); // adds the content to the previous content

        fileWriter.close();

        fileWriter1.close();
    }
    
}
