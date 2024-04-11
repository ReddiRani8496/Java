import java.util.Scanner;

public class PowerOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x = sc.nextInt();

        System.out.println(powerN(n,x));
    }

    private static int powerN(int n, int x) {
        if(x == 0)
            return 1;

        return n*powerN(n, x-1);
    }



}
