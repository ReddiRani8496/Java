public class ThreadPriorityEx {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            for (int i = 0; i <10;i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i <10;i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        t1.setPriority(Thread.MAX_PRIORITY);
        System.out.println(t1.getPriority());
        t1.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t2.getPriority());
        t2.start();
    }
}
