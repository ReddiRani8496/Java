import java.io.FileInputStream;

public class ReadingImages {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("/home/reddirani/Desktop/Java/Files/dog.jpg");
            byte[] image = new byte[fis.available()];
            fis.read(image);
            System.out.println("Image read successfully");
            fis.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
