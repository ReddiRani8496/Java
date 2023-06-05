@FunctionalInterface
interface Rock {

    void hello(String str);

}
class MethodReferenceEx1{
    public static void main(String[] args) {

        Rock rock = Duck::hello; // the method hello is static in Duck class, so we can access by class and method name
                                    // method reference refers to the method via the use of an :: operator.

        rock.hello("Hello"); 
        
    }
}
class Duck {

    public static void hello(String str) {

        System.out.println(str);

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.contains("h"));

    }
}