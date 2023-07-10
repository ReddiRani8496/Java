public class RunnableInterface {

    public static void main(String[] args) {

        Nick nick = new Nick();
        Mock mock = new Mock();

        Thread t1 = new Thread(nick);
        Thread t2 = new Thread(mock);

        t1.start(); // simultaneously prints nick and mock class i.e., runs mutliple threads simultaneously
        t2.start();

//        t1.run(); // prints run method until the condition false i.e., runs a single thread at a time
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
