@FunctionalInterface
interface Rock {

    void hello(String str);

}
class MethodReferenceEx2{
    public static void main(String[] args) {
        /*
         * Duck duck = new Duck();
         * Rock rock = duck::hello;
         * rock.hello("hello");
         */
    

        Rock rock = new Duck()::hello;  // hello() method in Duck class is non-static so we have to create the object for Duck class

        rock.hello("Hello"); 
        
    }
}
class Duck {

    public  void hello(String str) {

        System.out.println(str);

        System.out.println(str.toUpperCase());

        System.out.println(str.toLowerCase());

        System.out.println(str.contains("h"));
        
    }
}