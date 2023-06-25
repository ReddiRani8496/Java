public class FinalizeEx {

    public static void main(String[] args) {

        Sample s = new Sample();

        s = null;

        System.gc(); // Explicitly call the garbage collector

    }
}
class Sample {
    @Override
    protected void finalize() throws Throwable {

        System.out.println("object destroyed");

    }
}
