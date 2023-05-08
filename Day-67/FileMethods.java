import java.io.*;
import java.util.Date;
public class FileMethods  {
    public static void main(String[] args) throws IOException{
        File f1 = new File("rock.txt");

        File f2 = new File("Desktop/Java");
        System.out.println( f1.createNewFile()); // creates new file, if the file is not present

        System.out.println(f1.canRead()); // tests whether the file is readable or not

        System.out.println(f1.canExecute()); // tests whether the file is executable or not

        System.out.println(f1.canWrite()); // tests whether the file is writable or not

        System.out.println(f1.compareTo(new File("duck.txt"))); // compares the file path with the specified file path, if matches return 0, otherwise return ASCII val difference

        System.out.println(f1.isHidden()); // returns true if the file is hidden, otherwise returns false

        System.out.println(f1.equals(new File("duck.txt"))); //returns true if file is equal to the specified file, otherwise returns false

        System.out.println(f1.isDirectory()); // returns true if the file is directory, otherwise returns false

        System.out.println(f1.isFile()); 
        
        System.out.println(f2.isDirectory());

        f1.renameTo(new File("rocks.txt")); // renames the file name

        System.out.println(new Date(f1.lastModified()));

        File file = new File("/home/reddirani/Desktop/Java/Day-67/duck");
        
        file.mkdir(); //creates the new directory

        File file1 = new File("/home/reddirani/Desktop/Java/Day-67");

        for(var x : file1.list())
          System.out.println(x);  // lists all the files in the specified path
    
    }

}
