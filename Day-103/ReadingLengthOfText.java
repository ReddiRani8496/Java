import java.io.*;

public class ReadingLengthOfText {

    public static void main(String[] args) throws IOException {
        /* Writing data to file and also writing the length of the file

            FileOutputStream fos = new FileOutputStream("weight.txt");

            DataOutputStream dos = new DataOutputStream(fos);

            double weights[] = {5.4,12.5,3.8,34.89};

            dos.writeInt(weights.length); // First we write the length of file, while accessing the data it will be usefull

            for(int i=0;i<weights.length;i++)

                dos.writeDouble(weights[i]); // writing data to file

            dos.close();

            fos.close();

         */
          // Reading from the weights file
            FileInputStream fis = new FileInputStream("weight.txt");


            DataInputStream dis = new DataInputStream(fis);

            int len = dis.readInt(); //reading length of the file

            for (int i = 0; i < len; i++) {

               System.out.println(dis.readDouble());

            }

    }

}


