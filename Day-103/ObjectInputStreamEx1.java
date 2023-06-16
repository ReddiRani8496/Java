import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamEx1 {

    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("john.txt");

            ObjectInputStream ois = new ObjectInputStream(fis);

            SoftwareEngineer se = (SoftwareEngineer) ois.readObject();

            System.out.println(se);

            System.out.println(se.name);

            System.out.println(se.age);

            System.out.println(se.weight);

            se.sayHi();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
