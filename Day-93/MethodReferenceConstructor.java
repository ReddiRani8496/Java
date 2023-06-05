@FunctionalInterface
interface Rock {

   void hello(int x,int y);

}

public class MethodReferenceConstructor {
    public static void main(String[] args) {

        Rock rock = Duck :: new;

        rock.hello(10, 20);

    }
}

class Duck {

    Duck() {

        System.out.println("Duck1");

    }

    Duck(int x,int y) {

        System.out.println(x+y);

    }
}
