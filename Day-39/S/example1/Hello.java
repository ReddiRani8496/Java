package example1;
import example2.Rock;
public class Hello {
    public static void main(String[] args) {
        Rock r=new Rock();
        System.out.println(r.d);
       // System.out.println(r.b);//we cannot access b because it is default variable, scope is within the package
      // System.out.println(r.c);we cannot access variable c because it is default variable, scope is within the class
    }
}
