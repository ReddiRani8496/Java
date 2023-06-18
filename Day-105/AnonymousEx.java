public class AnonymousEx {
    public static void main(String[] args) {
        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Greetings");
                greeting("john"); // we can call other methods in interface methods
            }
            public void greeting(String name){
                System.out.println("hello "+name);
            }
        };
        greeting.greet();

    }
}
interface Greeting {
    void greet();
}
