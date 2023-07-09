public class MultiThreadingEx {

    public static void main(String[] args) {

        Rock rock = new Rock();
        Duck duck = new Duck();

        rock.start();
        duck.start();

        rock.run();
        duck.run();

    }
}
class Rock extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("iRock");
        }
    }
}
class Duck extends Thread {

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("iDuck");
        }

    }
}
