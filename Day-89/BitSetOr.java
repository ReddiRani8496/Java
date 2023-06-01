import java.util.BitSet;
public class BitSetOr {
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

        bitset1.or(bitset2);    // performing or operation, returns true if any one bit or both bits true

        System.out.println(bitset1);



    }
}

