//program to illustrate the ArrayIndexOutOfBoundsException
public class ExceptionsEx {
    public static void main(String[] args) {
        int arr[] = new int[5];

       // System.out.println(arr[7]); //throws ArrayIndexOutOfBoundsException

        try {

            System.out.println(arr[6]);
        }
        catch(Exception e) {
            
            System.out.println("use proper index");
        }
    }
}
