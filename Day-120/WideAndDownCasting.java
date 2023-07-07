public class WideAndDownCasting {
    public static void main(String[] args) {

        Parent p = new Child(); // this is upcasting
        p.nokia105(); // parent can access only parent method

        Child c = (Child) p; // this is down casting
        c.iphone14(); // child can access both child and parent methods
        c.nokia105();

        Parent p1 = new Child();
        p1.nokia105();

        Child c1 = (Child) p1;

    }
}
class Parent {
    void nokia105() {
        System.out.println("Parents nokia105");
    }
}
class Child extends Parent {
    void iphone14() {
        System.out.println("kid's phone iphone14");
    }
    @Override
    void nokia105() {
        System.out.println("childrens nokia105");
    }

}