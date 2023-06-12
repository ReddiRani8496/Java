import java.io.*;

public class ByteArrayInputStreamEx {
    public static void main(String[] args) {

        byte byte1[] = {'a','b','c','d'};

        ByteArrayInputStream bis = new ByteArrayInputStream(byte1);

        String str = new String(bis.readAllBytes());

        System.out.println(str);

    }
}
