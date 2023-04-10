//program to illustrate the CompileTime polymorphism
public class Car {
    public static void main(String[] args) {
        Audi a=new Audi();
      //  a.price(430000);
      a.price(610000, 680000);
    }
}
class Audi {
    static void price(double price){
        System.out.println("Audi A4");
    }
    static void price(double price1,double price2){
        System.out.println("Audi A6");
    }
}
