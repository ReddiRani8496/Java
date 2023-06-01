import java.util.BitSet;

public class BitSetClear {
    public static void main(String[] args) {

        BitSet bitset = new BitSet();

        bitset.set(4);
        bitset.set(34);
        bitset.set(21);
        bitset.set(76);
        bitset.set(65);

        System.out.println(bitset);
        bitset.clear(1,25);

        System.out.println(bitset);  // print bitset after clear from index 1 to 25

        bitset.clear(76); // clears the 76 from bitset
        System.out.println(bitset);

        bitset.clear(); // clears the bitset
        System.out.println(bitset);

    }
}
