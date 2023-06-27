public class SealedEx1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Tiger tiger = new Tiger();
        tiger.sound();
    }
}
sealed class Animal { // if we don't specify permits, then the sealed class can only be extended by the final and non-sealed classes
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

