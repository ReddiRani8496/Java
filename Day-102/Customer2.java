import java.io.*;

public class Customer2 {
    public static void main(String[] args) throws IOException {
       /* FileOutputStream fos = new FileOutputStream("mock.txt"); // storing the data file, so we can access the data when we need

        DataOutputStream dos = new DataOutputStream(fos);

        SBI king = new SBI("King");

        king.setBalance(300000);

        king.setMinbalance(1000);

        dos.writeUTF(king.getName());

        dos.writeDouble(king.getBalance());

        dos.writeInt(king.getMinbalance());
         */

        FileInputStream fis = new FileInputStream("mock.txt");

        DataInputStream dis = new DataInputStream(fis); // reading data from the file

        SBI sbi = new SBI(dis.readUTF());

        sbi.setBalance(dis.readDouble());

        sbi.setMinbalance(dis.readInt());

        System.out.println(sbi.getName());

        System.out.println(sbi.getBalance());

        System.out.println(sbi.getMinbalance());
    }
}
