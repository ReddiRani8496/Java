public class InitializerBlockEx3 {
    public static void main(String[] args) {
        
        Dog d1 = new Dog("Charlie");

        Dog d2 = new Dog("Max", 12);

        Dog d3 = new Dog();

        System.out.println(Dog.getCount());
    }    
}
class Dog {

    private static int count;

    private String name;

    private int age;

    {
        count++;
    }
    public Dog(){

    }
    public Dog(String name) {

        this.name = name;
    }
    public Dog(String name, int age) {

        this.age = age;
    }
    public static int getCount() {

        return count;
    }
}
