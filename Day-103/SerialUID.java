import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class SerialUID {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("john.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            SoftwareEngineer se = (SoftwareEngineer) ois.readObject();
            // uid=-640139511826147860
            //System.out.println(ObjectStreamClass.lookup(se.getClass()).getSerialVersionUID()); // returns same as ObjectOutputStreamEx1 class, because software engineering class contains same data in both files

            // uid= 8680266839973122228, it is different from ObjectOuputStreamEx1 class, because we made name as static in this class
            System.out.println(ObjectStreamClass.lookup(se.getClass()));
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
