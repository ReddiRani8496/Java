import java.util.BitSet;

public class BitSetFlip {
    public static void main(String[] args) {

        BitSet bitset = new BitSet();

        bitset.set(0);

        bitset.set(1);

        bitset.set(2);

        bitset.set(3);

        System.out.println(bitset);
        
        System.out.println(bitset.get(1));
        
        bitset.flip(1);
        
        System.out.println(bitset.get(1));
        
        System.out.println(bitset.get(0));
        
        System.out.println(bitset.get(2));
        
        bitset.flip(0,3);
        
        System.out.println(bitset.get(2));
        
        System.out.println(bitset.get(0));
    }
}
