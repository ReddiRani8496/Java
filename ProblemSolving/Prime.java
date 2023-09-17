public class  Prime {
    public static void main(String[] args) {
//        System.out.println(highestCommonFactor(8,12));
//        commonFactors(8,12);
//
//        commonFactorsReverse(8,12);
//        System.out.println(lowestCommonFactor(8,12));
//        primeNumbersTill(10);
//        System.out.println(isPrime(11));

        fistNPrimes(10);
        primeNumbers(10,20);
        fraction(12,18);
    }
    public static int highestCommonFactor(int n1, int n2){
        for(int i=n1;i>=1;i--){
            if(n1%i==0 && n2%i==0) {
                return i;
            }
        }
        return 1;
    }
    public static void commonFactors(int n1, int n2) {
        for(int i=1;i<=n1;i++) {
            if(n1%i==0 && n2%i==0)
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void commonFactorsReverse(int n1,int n2) {
        for(int i = n1; i >= 1; i--)
            if(n1%i==0 && n2%i==0)
                System.out.print(i+" ");
        System.out.println();
    }
    public static int lowestCommonFactor(int n1,int n2) {
        int product = n1*n2;
        int hcf = highestCommonFactor(n1,n2);
        return product/hcf;
    }

    public static void primeNumbersTill(int n) {
        for(int i=2;i<=n;i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }
    public static boolean isPrime(int n) {
        for(int i=2;i*i<=n;i++)
            if(n%i==0)
                return false;
        return true;
    }

    public static void fistNPrimes(int n) {
        int count = 0;
        for (int i = 2; count < n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
    }

    public static void primeNumbers(int n1,int n2) {
        for(int i=n1;i<=n2;i++) {
            if(isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println();
    }

    public static void fraction(int n1,int n2){
        int hcf = highestCommonFactor(n1,n2);
        int first = n1/hcf;
        int second = n2/hcf;
        System.out.println(first+"/"+second);
    }
}
