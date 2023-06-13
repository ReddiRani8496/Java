import java.io.*;
public class RandomAccessFileEx {
    public static void main(String[] args) {
        
        try {
            
            RandomAccessFile raf = new RandomAccessFile("Rock.txt", "rw"); // providing both read and write permissions
            
            System.out.println((char)raf.read());
            
            System.out.println((char)raf.read());
            
            System.out.println((char)raf.read());
            
            raf.seek(1); // go to specified index
            
            System.out.println((char)raf.read());
            
            System.out.println(raf.getFilePointer()); // display current position of the pointer
            
            raf.seek(raf.getFilePointer()-1); // moves one place backward
            
            System.out.println((char)raf.read());
            
            byte b[]={'a','s','d','f'};
            
            raf.write(b); // write the array characters to file
            
            raf.close();
        
        }catch (Exception e) {

            e.printStackTrace();
            
        }
    }
}
