import java.io.*;
public class WriterClass {
     public static void main(String[] args) {
        try {
            Writer writer = new PrintWriter(System.out);
            writer.write("mock");
            writer.flush();
            writer.close();
        } catch (Exception e) {
                System.out.println(e.getMessage());
        }
    }
    
}
