import java.io.File;
import java.io.IOException;
public class FileMethods {
    public static void main(String[] args) throws IOException {
        
        File file = new File("Cats.java"); //specify the file name

        if(file.exists()) {
            System.out.println("File is already there");
            System.out.println("I am deleting the file");
            file.delete();
            System.out.println("file has been deleted successfully");
        } else {
            System.out.println("File is not there");
            System.out.println(file.createNewFile()); // creates the new file
        }

      // System.out.println(file.delete());

       System.out.println(file.getPath()); // returns the path of the file

       System.out.println(file.length()); // returns the size of the file in bytes

       System.out.println(file.getAbsolutePath()); //returns the absolute pathname of the file

       System.out.println(file.getName()); //returns the name of the file
    } 
}
