public strictfp class StrictfpAbstract { // class can be declared as strictfp

    public static void main(String[] args) {

        new Dog().sound();

    }
}
strictfp abstract class Animal {

   // strictfp abstract void sound();  // strictfp cannot be used with abstract methods.

    abstract void sound();
}
class Dog extends Animal {
    void sound() {

        System.out.println("Bow Bow");

    }
}
