public class NumberOfDigits {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numberOfDigits(n));
    }

    private static int numberOfDigits(int n) {

        if(n == 0)
            return 0;

        return 1 + numberOfDigits(n/10);
    }
}
