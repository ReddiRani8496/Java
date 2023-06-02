public class SingletonDesignPattern {
    public static void main(String[] args) {

      //  Duck duck = new Duck(); // the constructor in duck class is private we cannot create the object of Duck outside the class
        
        System.out.println(Duck.a);

         
        System.out.println(Duck.getDuck());

        Duck.getDuck().doSomething();

    }    
}
class Duck {

    static int a = 45*5;

    private static Duck obj = new Duck();

    private Duck() {
        
    }

    public static Duck getDuck() {

        return obj;

    }

    public void doSomething() {

        System.out.println("do something");
    }
}
