import java.io.*;

public class BufferedReaderEx {
    public static void main(String[] args) {

        try{

            FileReader fileReader = new FileReader("Rock.txt");

            BufferedReader br = new BufferedReader(fileReader);

           // System.out.println(br.readLine());// reads the line at a time

            System.out.println(br.markSupported()); // returns true
            
            br.mark(3);

            br.reset();

            System.out.println((char)br.read());

            br.close();

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}
