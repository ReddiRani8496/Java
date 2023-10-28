
public class Main {
    public static void main(String[] args) {
        Rock r = new Nick();
        System.out.println(r.x); // Rock class x will be printed, variables cannot be overridden
        r.hi(); // hi rock
        r.sing(); // Nick sings
      //  r.dance(); cann't access child method which is not present in parent class
    }
}

class Rock {
    int x=10;

    private void hello() {
        System.out.println("Hello rock");
    }

    static void hi() {
        System.out.println("Hi rock");
    }

    void sing() {
        System.out.println("Rock sings");
    }

    final void drink() {
        System.out.println("Rock drinks");
    }
}
class Nick extends Rock {
    int x = 20;
    private void hello() { // private methods cannot be overridden
        System.out.println("Hello Nick");
    }

    static void hi() { // static methods cannot be overridden
        System.out.println("Hi Nick");
    }

    void sing() {
        System.out.println("Nick sings");
    }

    void dance() {
        System.out.println("Nick dances");
    }

//    void drink() { // cannot override final method
//        System.out.println("Nick drinks");
//    }
}
