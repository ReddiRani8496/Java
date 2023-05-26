public class LambdaEx {
   public static void main(String[] args) {
    
    Dog d =()-> System.out.println("Bow Bow"); // If there exit single statement no need to mention curly braces.

    System.out.println("Dog sound"); // it is not belongs to LambdaEx class

    d.bark();

   } 
}
interface Dog {

    void bark();
}
