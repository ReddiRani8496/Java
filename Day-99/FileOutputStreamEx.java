import java.io.FileOutputStream;
 
public class FileOutputStreamEx {
    public static void main(String[] args)
    {
 
      
 
        try {
            FileOutputStream output = new FileOutputStream("rock.txt");
           
            String str = "hello world";
 
            byte[] array = str.getBytes();  // converts a string into bytes array.
 
         
            output.write(array);
 
            output.close();
        }
 
        catch (Exception e) {
            e.getStackTrace();
        }
    }
}

