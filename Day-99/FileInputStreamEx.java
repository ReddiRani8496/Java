// reading the data from file using FileInputStream

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamEx {
    public static void main(String[] args) throws FileNotFoundException {

        byte array[];

        try {

            FileInputStream inputStream = new FileInputStream("hello.txt");

            array = new byte[inputStream.available()]; // the size of the byte array is number of bytes in the file

            System.out.println(inputStream.available()); // returns the number of bytes in the file

            inputStream.read(array); // reading values into the byte array

            System.out.println(inputStream.available()); // returns 0, after reading the data, there will be no data left
 
            String str = new String(array); //converting the data into string 

            System.out.println(str); // printing the data

        }

        catch (Exception e) { 

            e.getStackTrace();

        }


    }
}
