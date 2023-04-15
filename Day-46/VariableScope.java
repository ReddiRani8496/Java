public class VariableScope {
   public static void main(String[] args) {
    int x=10;
    {
        //int x=20; we can't create x variable, duplicate variable x
        System.out.println(x);
    }
    {
        int y=20;//scope is within the block
        System.out.println(y);
    }
    int y=30; 
    System.out.println(y);
    
   }   
}
