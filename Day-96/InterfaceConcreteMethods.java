public class InterfaceConcreteMethods implements book{
    public static void main(String[] args) {

        InterfaceConcreteMethods text = new InterfaceConcreteMethods();

        text.s();

        book.page();
    }

}
interface book {

    default void s() { // we can create concrete methods inside the interface by using default keyword

        System.out.println("hi");

    }

    static void page() { // we can create concrete methods inside the interface by using static keyword

        System.out.println("This is a page");
    }

}
