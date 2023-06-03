public class PrintStatementWorking {

    public static void main(String[] args) {

        System1.out.println("hello"); // here System1 is the class, out is field of System1 class, println is the method of PrintStream class, it must be static

    }

}
class System1 {

    public static PrintStream out;

}
class PrintStream {

    public static void println(String str) { // the method must be static , otherwise null pointer exception will raise

        System.out.println(str);

    }

}
