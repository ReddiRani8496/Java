// synchronized means only one thread will be allowed to run at a time
// synchronized is thread safe
public class SynchronizedEx {
    int count = 0;
    public synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws Exception{
        SynchronizedEx synchronizedEx = new SynchronizedEx();
        Thread t1 = new Thread(()->{
            for (int i = 0; i <1000;i++) {
                synchronizedEx.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i <1000;i++) {
                synchronizedEx.increment();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count: " + synchronizedEx.count);
    }
}
