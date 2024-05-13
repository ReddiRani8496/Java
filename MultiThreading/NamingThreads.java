public class NamingThreads {
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
        t1.setName("HiThread");
        System.out.println(t1.getName());
        t1.start();
    }
}
