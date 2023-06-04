public class ConstructorNotFinal {

   /* final ConstructorNotFinal() {  // in java the constructor can't be final, because final keyword prevents a method to be overridden
                                    // the constructor must be public, private, default and protected
        System.out.println("hi");
    } */

    public static void main(String[] args) {
        
    }
}
class Rock {

    final void sum() {
        System.out.println("we cannot modified once declare as final method");
    }

    
}
class Nock extends Rock {

  /*   void sum() { // we cannot overriding this method because we are declaring sum method as a final.

    }*/
}