public class ThreadsUsingLambdaExpression {
    public static void main(String[] args) {
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

    }
}
