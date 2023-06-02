import java.util.BitSet;

public class ToLong {

    public static void main(String[] args) {

        BitSet bitset  = new BitSet();

        bitset.set(0);

        bitset.set(1);

        bitset.set(3);

        bitset.set(5);

        bitset.set(6); // stores in 0 - 63 bits range, length =1

        bitset.set(128); // stores in 128-191 bits range, length = 3

        bitset.set(256); // stores in 256-319 bits range, length = 5

        long[] arr = bitset.toLongArray();

        System.out.println(arr.length); // length = 5
    }
}
