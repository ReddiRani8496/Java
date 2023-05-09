import java.io.*;
public class TryWithResources {
    
    public static void main(String[] args) {
        
        try(FileOutputStream fos = new FileOutputStream("hello.txt")) {

            String text = "hello world";

            byte arr[]  = text.getBytes(); //converting String to byte

            fos.write(arr);

           // fos.flush(); try with resources automatically flushes the resources

           // fos.close(); try with resources automatically closes the resources

        } catch(Exception e) {
            
            System.out.println(e.getMessage());
        }
    }
}
