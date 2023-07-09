public class RunnableInterface {

    public static void main(String[] args) {

        Nick nick = new Nick();
        Mock mock = new Mock();

        Thread t1 = new Thread(nick);
        Thread t2 = new Thread(mock);

        t1.start(); // simultaneously prints nick and mock class
        t2.start();

//        t1.run(); // prints run method until the condition false
//        t2.run(); // prints run method only after t1 execution completes

    }
}
class Nick implements Runnable {
    @Override
    public void run() {
        
        for (int i = 0; i < 10; i++) {

            System.out.println("iNick");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Mock implements Runnable {
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("iMock");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
