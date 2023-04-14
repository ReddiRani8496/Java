/*abstract keyword is a non access modifier
 * The class which is declared as abstract key word is called abstract class
 * if one method is abstract then class must be declared as abstract, abstact methods do not specify a body.
 * we can declare class as abstract, alothough there are no abstract methods
 */
class AbstractExample{
    public static void main(String[] args) {
       SBI s=new SBI(); 
     s.deposit();
     s.intrestRate();
    UnionBank u=new UnionBank();
     u.intrestRate();
    }
}
abstract class RBI{
    void deposit(){
        System.out.println("Amount deposited into bank");
    }
    void withdraw(){
        System.out.println("money is withdrawing");
    }
  abstract  void intrestRate();
}
class SBI extends RBI{
   @Override
   void intrestRate() {
       System.out.println("10%");
   }
}
class UnionBank extends RBI{
    void intrestRate(){
        System.out.println("12%");
    }
}