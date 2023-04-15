//multiple inheritance is achieved by extending one class and implementing one interface
public class MultipleInheritance1 {
    public static void main(String[] args) {
      Animal a=new Animal();
      a.sound();
      a.run();  
    }
}
interface Dog{
    public void sound();
}
class Lion{
    public void run(){

    }
}
class Animal extends Lion implements Dog{
    public void run(){
        System.out.println("lion is running");
    }
    public void sound(){
        System.out.println("bow bow");
    }
}
