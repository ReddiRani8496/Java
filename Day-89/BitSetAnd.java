import java.util.BitSet;
public class BitSetAnd {
    public static void main(String[] args) {
        BitSet bitset1 = new BitSet();
        BitSet bitset2 = new BitSet();

        bitset1.set(30);
        bitset1.set(14);
        bitset1.set(29);

        bitset2.set(62);
        bitset2.set(45);
        bitset2.set(56);

        System.out.println( bitset1);
        System.out.println(bitset2);

        bitset1.and(bitset2);    // performing and operation between two bitsets

        System.out.println(bitset1);


        System.out.println(bitset1.cardinality()); // returns the number of bit sets
        System.out.println(bitset2.cardinality());


    }
}
