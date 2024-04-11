import java.util.Scanner;

public class GeometricSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(geometricSum(n));
    }

    private static double geometricSum(int n) {
        if(n==0)
            return 1;
        return (1/Math.pow(2,n))+geometricSum(n-1);
    }
}
