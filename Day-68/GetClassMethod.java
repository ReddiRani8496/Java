public class GetClassMethod {
    public static void main(String[] args) {

        Duck d = new Duck();

        System.out.println(d.getClass());  // returns class Duck

        System.out.println(d.getClass().getName()); // returns Duck
    }    
}
class Duck {
    
    int age;
}
