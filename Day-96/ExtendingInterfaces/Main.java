
public class Main implements Cat { // the interface cat contains all the methods of Nick and duck interface, so we can implement only cat interface in main class, it looks clear

    public static void main(String[] args) {

        Main main = new Main();

        main.sayHi();

        main.hi();

        main.hello();

    }

    @Override
    public void sayHi() {

        System.out.println("hi guys");

    }

    @Override
    public void hello() {

        System.out.println("hello");

    }

    @Override
    public void hi() {

        System.out.println("hi");

    }
}