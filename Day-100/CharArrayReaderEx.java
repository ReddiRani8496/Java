import java.io.CharArrayReader;  

public class CharArrayReaderEx {  
  public static void main(String[] ag) throws Exception {  

    char[] ch = { 'j', 'a', 'v', 'a'};  

    CharArrayReader reader = new CharArrayReader(ch);  

    int x=0; 

    while ((x = reader.read()) != -1) {  

       System.out.print((char)x);

    }  
  }  
} 