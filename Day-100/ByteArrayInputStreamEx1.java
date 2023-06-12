import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamEx1 {
    public static void main(String[] args) {
         byte byte1[] = {'a','b','c','d','e'};

        ByteArrayInputStream bis = new ByteArrayInputStream(byte1);

        System.out.println((char)bis.read());

        System.out.println((char)bis.read());

        System.out.println(bis.markSupported()); //It is used to test the input stream for mark and reset method

        bis.mark(3);

        System.out.println((char)bis.read());

        System.out.println((char)bis.read());

        bis.reset(); // It is used to reset the buffer of a byte array

        System.out.println((char)bis.read());

        System.out.println((char)bis.read());

    }
}
