import java.io.FileReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        
        FileReader reader = new FileReader(new File("mock.txt"));

        int x = reader.read();

        while(x != -1) {

            System.out.print((char)x);

            x = reader.read();
        }
        System.out.println();
        
        Scanner sc = new Scanner(new File("mock.txt")); // reading content of a file using Scanner class

        while(sc.hasNext()) {

            System.out.println(sc.nextLine());
        }
        
        reader.close();
    }
}
