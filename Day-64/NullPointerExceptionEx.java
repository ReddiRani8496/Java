public class NullPointerExceptionEx {
    public static void main(String[] args) {

        String s = null;

      //  System.out.println(s.length()); // throws NullPointerExceptions

        try {

            System.out.println(s.length());
        }
        catch (Exception e) {

           // System.out.println(e);

            e.printStackTrace();
        }
        Rock r = new Rock();
        System.out.println(r.x.length());
      
    }    
}
class Rock {
    String x;
}
