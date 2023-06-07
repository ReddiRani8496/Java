public class SafeVarargsAnnotation {
    public static void main(String[] args) {

        Maths<Integer> my = new Maths<>();

        Integer[] a = {3,4,5};

        my.showman(a);
    }
}
class Maths<T> {

    @SafeVarargs // to avoid warning of heap pollution from parameterized vararg type

    final void showman(T... args) {

        for(T x: args) {

            System.out.println(x);
            
        }
    }
}

