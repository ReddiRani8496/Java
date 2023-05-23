public class InitializerBlockEx4 {
    public static void main(String[] args) {

        int x = 10;
        {
          //  int x =10; //Duplicate variable x

            System.out.println(x);
            
            int y = 20;

            System.out.println(y);

            
        }

        int y =30;

        System.out.println(y);

       // System.out.println(x); // The scope of x variable is within the initializer block
    }    
}
