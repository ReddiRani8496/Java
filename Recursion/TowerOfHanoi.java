import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of disks: ");
        int disks = sc.nextInt();
        towerOfHanoi(disks, "S", "H", "D");
    }
    private static int towerOfHanoi(int disks, String src, String helper, String dest) {
        if (disks == 1) {
            System.out.println("Move disk 1 from " + src + " to " + dest);
            return 1;
        }
        int moves = 0;
        moves += towerOfHanoi(disks - 1, src, dest, helper);
        System.out.println("Move disk " + disks + " from " + src + " to " + dest);
        moves += towerOfHanoi(disks - 1, helper, src, dest);
        return moves;
    }
}