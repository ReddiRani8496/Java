// Whenever an interface is having exactly one method is called functional interface
class FunctionalInterfaceEx {
    public static void main(String[] args) {

        Dog d1 = new Dog() {

            @Override
            public void bark() {

                System.out.println("Bow Bow");

            }

        };

        d1.bark();
    }
}

interface Dog {
    
    void bark();
}
