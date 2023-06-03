public class MainMethodCalling {

    public static void main(String[] args) { // the main method is called by the jvm as className.main(), the method must be static
        // if we don't declare main method as static, then we need to create the object of class in order to access main method
        //  if we do not make main() method static, there is no compilation error,we  will get runtime error
        // there is no use of returning any value to JVM, who actually invokes this method, so main method is void
        // main method is used to tell the JVM from where the execution starts

        System.out.println("hi");
    }
}
