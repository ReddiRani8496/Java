public class ExtendingInterface {
    public static void main(String[] args) {

        Animal animal = new Animal();

        animal.eat();

        animal.fly();
    }
}
interface Lion {

    public void eat();
}
interface Bird extends Lion {  // we can extend one interface from another interface

    public void fly();
}
class Animal implements Bird {

        public void eat() {

            System.out.println("Lion eats Deer");
        }
        public void fly() {

            System.out.println("Bird flies in the sky");
        }
}
