public class ThreadEx1 implements Runnable{

    @Override
    public void run() {
        for(int i = 0; i <10;i++) {
            System.out.println("Thread " + i + "");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadEx1 thread1 = new ThreadEx1();
        Thread thread = new Thread(thread1);
        thread.start();
    }
}
