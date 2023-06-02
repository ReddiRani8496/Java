public class SuperKeyword {
    public static void main(String[] args) {
        
        Tiger tiger = new Tiger(10);
        
    }
}
class Animal {

    Animal() {

        System.out.println("Default parent constructor");

    }

    Animal(int x) {

        System.out.println("parent1");

    }

    Animal(int x, int y) {

        System.out.println("parent2");

    }
}
class Tiger extends Animal {

    Tiger() {

        System.out.println("Default child constructor");

    }

    Tiger(int x) {

        super(20, 30);

        System.out.println("child 1");

    }

    Tiger(int x, int y) {

        System.out.println("child 2");

    }
}
