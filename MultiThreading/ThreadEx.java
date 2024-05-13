public class ThreadEx extends Thread{
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
        ThreadEx thread1 = new ThreadEx();
        thread1.start();
    }
}
