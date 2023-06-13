import java.io.*;

public class FileEx {
    public static void main(String[] args) {

        try{
        
            File file = new File("Nick.txt"); // the file is created in the jvm

            file.createNewFile(); // creates file in current path
        
        } catch(Exception e) {

            e.printStackTrace();
        }
        
    }
}
