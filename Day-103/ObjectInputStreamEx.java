import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class ObjectInputStreamEx {
    public static void main(String[] args)  {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the customer name:");
            String custName = sc.next();
            FileInputStream fis = new FileInputStream("CustomerData.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            int count = ois.readInt();
            Bank[] list = new Bank[count];
            for (int i = 0; i < count; i++)
                list[i] = (Bank) ois.readObject();
            for (Bank cust : list) {
                if (cust.name.equalsIgnoreCase(custName))
                    System.out.println(cust.balance);
            }
            ois.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
