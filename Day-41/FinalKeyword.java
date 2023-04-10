//program to illustrate the final keyword 
public class FinalKeyword {
    public static void main(String[] args) {
        int a=10;
        a=20;
        System.out.println(a);
        final int b=30;
      //  b=30; cannot assign a value to final variable b
        System.out.println(b);
    }
    
}
