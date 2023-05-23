public class InitializerBlockEx5 {

    void hello() {

        System.out.println("Say hello");
         
        int x =10;

        {
            int y = 20;

            System.out.println(y);

            System.out.println(x);
        }

       // System.out.println(y);//can't be accessed outside the initializer block

       System.out.println(x);

    }
    public static void main(String[] args) {

        InitializerBlockEx5 i = new InitializerBlockEx5();
        
        i.hello();
    }    
}
