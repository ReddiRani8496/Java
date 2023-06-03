public class ThreadSafeSingleton {
    public static void main(String[] args) {
        
       System.out.println(A.getInstance()); 
        
       System.out.println(A.getInstance()); 
    }
}
class A {
    private static A myObj; // the default value is null

    private A() {

    }

    synchronized public static A getInstance() { // synchronized method to control simultaneous access

        if (myObj == null) { // since default value is null, the if condition is true, then new object is created

            myObj = new A();

        }

        return myObj; // returning the object

    }
}

