//Finally block executes whether exception rise or not and whether exception handled or not

public class FinallyBlock {
    public static void main(String[] args) {
        
        try {
            System.out.println(34/2);
        }

        catch(Exception e) {
            System.out.println("Arithmetic exception");
        }
        
        finally {
            System.out.println("finally block always execute");
        }
    }    
}
