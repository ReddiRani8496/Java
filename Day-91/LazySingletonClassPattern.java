public class LazySingletonClassPattern {

    public static void main(String[] args) {

        System.out.println(A.getInstance());

        System.out.println(A.getInstance()); // when we call this method, it will go to getInstance() method and checks the
                                            // if condition , the condition is false, since the myobj contains previous object reference,
                                            //  then it will return the previous object reference, only one instance is created
    }
}
class A {
    private  static A myObj; // the default value is null
    private A() {

    }
    public static A getInstance() {

        if(myObj == null) { // since default value is null, the if condition is true, then new object is created

            myObj = new A();

        }

        return myObj; // returning the object

    }

}
