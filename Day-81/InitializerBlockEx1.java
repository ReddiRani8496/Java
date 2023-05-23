public class InitializerBlockEx1 {
    public static void main(String[] args) {

        Duck d1 = new Duck();

        Duck d2 = new Duck();

        Duck d3 = new Duck();
        
    } 
}
class Duck {

    {
        System.out.println("Initializer Block"); // Initializer block runs every time whenever the object is created.
    }

}
