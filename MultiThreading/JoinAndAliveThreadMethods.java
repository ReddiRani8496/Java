public class JoinAndAliveThreadMethods {

    public static void main(String[] args) throws Exception{
        Runnable obj1 = ()->{
            for(int i = 0; i <10;i++) {
                System.out.println("Thread " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        t1.start();
        System.out.println(t1.isAlive());
        t1.join();
        System.out.println(t1.isAlive());
        System.out.println("Bye");
    }
}
