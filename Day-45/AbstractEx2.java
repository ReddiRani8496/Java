

public class AbstractEx2 {
    public static void main(String[] args) {
        //Cheetah c=new Cheetah();
        //c.run();
        Eagle e=new Eagle();
        e.fly();
        e.run();
    }
}
abstract class Animal{
   abstract void fly();
   abstract void run();
}
abstract class Cheetah extends Animal{
    void run(){
        System.out.println("cheetah is the fastest running animal");
    }
}
 class Eagle extends Animal{
    void run(){
        System.out.println("cheetah running ");
    }
    void fly(){
        System.out.println("Eagle is flying");
    }
}
