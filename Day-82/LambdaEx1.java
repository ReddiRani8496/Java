public class LambdaEx1 {
    
    public static void main(String[] args) {

        Dog d1 =() -> {

                System.out.println("Bow Bow");

        };

        d1.bark();
    }
}

interface Dog {
    
    void bark();

}

