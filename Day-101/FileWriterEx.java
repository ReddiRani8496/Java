import java.io.*;

public class FileWriterEx {
    public static void main(String[] args) {

        try {

            FileWriter fileWriter = new FileWriter("Duck.txt");

            fileWriter.write("welcome to java programming");

            fileWriter.close();

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}
