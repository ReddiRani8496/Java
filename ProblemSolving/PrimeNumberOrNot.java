public class PrimeNumberOrNot {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
      }
      return true;
    }
  


    public static void printFibonacciSeries(int n) {
        int first = 0, second = 1, nextTerm;
        System.out.print(first + " " + second);
        for (int i = 2; i < n; i++) {
            nextTerm = first + second;
            first = second;
            second = nextTerm;
            System.out.print(" " + nextTerm);
        }
    }

    public class DisplayNumbers {
        public static void main(String[] args) {
            int start = 1;
            int end = 10;
            if (args.length == 2) {
                start = Integer.parseInt(args[0]);
                end = Integer.parseInt(args[1]);
            }
            try {
                generateNumbers(start, end);
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }

        public static void generateNumbers(int start, int end) {
            for(int i = start; i <= end; i++) {
                System.out.println(i);
            }
        }
    }
}


