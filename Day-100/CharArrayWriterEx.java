 
import java.io.CharArrayWriter; 

import java.io.FileWriter;  

public class CharArrayWriterEx {  
    public static void main(String args[])throws Exception {

          CharArrayWriter out=new CharArrayWriter();

          out.write("hello");  

          FileWriter f1=new FileWriter("Mock.txt"); 

          FileWriter f2=new FileWriter("Most.txt"); 

          out.writeTo(f1);    

          out.writeTo(f2);    
           
          f1.close();    

          f2.close();    
           
    }    
}    
