import java.io.*;  
public class BufferedOutputStreamEx{    
public static void main(String args[])throws Exception {    

     FileOutputStream fout=new FileOutputStream("john.txt");    

     BufferedOutputStream bout=new BufferedOutputStream(fout);   

     String s="Welcome";

     byte b[]=s.getBytes(); 

     bout.write(b);   

     bout.flush(); 

     bout.close();  

     fout.close();     
   
    }    
} 
