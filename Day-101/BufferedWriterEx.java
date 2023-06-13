import java.io.*;

public class BufferedWriterEx {
    public static void main(String[] args) {
        
        try {
            
            FileWriter fileWriter = new FileWriter("Rock.txt");

            BufferedWriter br = new BufferedWriter(fileWriter);

            br.write("Reddirani"); // writing to Rock file
            
            br.close();

        } catch(Exception e) {
            
            e.printStackTrace();
            
        }
    }
    
}
