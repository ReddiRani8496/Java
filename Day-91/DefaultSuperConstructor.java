public class DefaultSuperConstructor {

    public static void main(String[] args) {

        Z z = new Z();

    }
}
class X {
    X() { // by default super() constructor is present in the child class constructor, when we call this constructor, parent class default constructor will be called
          // it is the child class of Object, so Object class default constructor will be called, we are not printing anything in Object class constructor, so nothing will be displayed on console

        System.out.println("X");

    }

}
class Y extends X {
    Y() { // by default super() constructor is present in the child class constructor, when we call this constructor, parent class default constructor will be called

        System.out.println("Y");
    }

}
class Z extends Y {
    Z() {
        // by default super() constructor is present in the child class constructor, when we call this constructor, parent class default constructor will be called
        System.out.println("Z");
    }

}
