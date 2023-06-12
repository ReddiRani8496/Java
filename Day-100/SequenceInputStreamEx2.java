//writing the data of two files Duck.txt and Nick.txt into another file named Sick.txt.

import java.io.*;

public class SequenceInputStreamEx2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Duck.txt");

        FileInputStream fis1 = new FileInputStream("Nick.txt");
        
        FileOutputStream fout = new FileOutputStream("Sick.txt");
        
        SequenceInputStream sis = new SequenceInputStream(fis, fis1);
        
        int j =0;
        
        while((j=sis.read())!=-1)
            fout.write(j);
        
        sis.close();
        
        fout.close();
        
        fis1.close();
        
        fis.close();

    }
}
