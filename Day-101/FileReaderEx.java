import java.io.*;

public class FileReaderEx {
    public static void main(String[] args) {

        try{

            FileReader fileReader = new FileReader("Rock.txt");

            System.out.println((char)fileReader.read());

            int x =0;

            while((x=fileReader.read())!=-1)
              
                System.out.print((char)x);

            fileReader.close();

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}
