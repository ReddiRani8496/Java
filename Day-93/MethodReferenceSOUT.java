@FunctionalInterface
interface Rock{

    void display(String str);

}

public class MethodReferenceSOUT {
    public static void main(String[] args) {

        Rock rock = System.out::println;

        rock.display("hello");

    }
    
}
