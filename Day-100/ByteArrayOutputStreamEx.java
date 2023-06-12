import java.io.*;  

public class ByteArrayOutputStreamEx {  
public static void main(String args[])throws Exception {

      FileOutputStream fout1 = new FileOutputStream("Nick.txt");    

      FileOutputStream fout2 = new FileOutputStream("Duck.txt");    
        
      ByteArrayOutputStream bout = new ByteArrayOutputStream(); 

      bout.write(97); 

      bout.writeTo(fout1);  // writing 'a' to Nick file

      bout.writeTo(fout2);  // writing 'a' to Duck file
        
      bout.flush(); 

      bout.close();

    }
         
}   
