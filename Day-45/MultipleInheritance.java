import javax.accessibility.AccessibleEditableText;

/*multiple inheritance is achieved by two ways:
 * 1)by extending one class and implementing two or more interfaces
 * 2)by implementing two or more interfaces
*/


public class MultipleInheritance {
    public static void main(String[] args) {
        C c=new C();
        c.display();
        c.show();
    }
}
interface A{
   public void display();
}
interface B {
   public void show();
}
class C implements A,B{
    public void display(){
       System.out.println("Interface A");
     }
     public void show(){
        System.out.println("Interface B");
     }

}
