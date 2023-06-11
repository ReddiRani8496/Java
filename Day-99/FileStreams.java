import java.io.*;

import java.util.Scanner;

public class FileStreams {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        byte[] array;

        try {

            FileInputStream inputStream = new FileInputStream("hello.txt"); 

            System.out.print("Enter the name of your copy: ");

            String str = sc.next();

            FileOutputStream outputStream = new FileOutputStream(str+".txt");

            array = new byte[inputStream.available()]; 

            inputStream.read(array); // reading the data from hello file

             String s = new String(array); // converting the byte array to string
             
            byte[] array1 = s.toUpperCase().getBytes();  // converting lowercase to upper case and storing in byte array
         
            outputStream.write(array1); // writing data to file

            inputStream.close();

            outputStream.close();

        } catch(Exception e) {

            e.getStackTrace();

        }

        sc.close();
    }
}

