public class ThisEx {
    public static void main(String[] args) {
        Knock knock = new Knock();
    }
}
class Knock {
    Knock() {
        System.out.println("Hi");
    }
    Knock(int a) {
        this();
        System.out.println("a");
    }
    Knock(int b,int c) {
        this(10);
        System.out.println("two parameters");
    }
}
