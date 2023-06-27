public class SealedEx1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Tiger tiger = new Tiger();
        tiger.sound();
    }
}
sealed class Animal {
    void sound() {
        System.out.println("noise");
    }
}
non-sealed class Dog extends Animal {
    void sound(){
        System.out.println("Barking");
    }

}
final class Tiger extends  Animal {
    void sound() {
        System.out.println("Roaring");
    }

}

