import java.util.BitSet;

public class ValueOf {
    public static void main(String[] args) {


        BitSet bitSet = new BitSet();
        byte[] arr = {1, 2};
        // 1 will be stored as [0,0,0,0,0,0,0,1]
        // index                7 6 5 4 3 2 1 0

        // 2 will be stored as [0, 0, 0, 0, 0, 0, 1, 0]
        // index                15 14 13 12 11 10 9  8

        BitSet b1 = bitSet.valueOf(arr); //	It returns a new bit set of the given byte array.

        System.out.println(b1);

        long[] arr1 = {1,2};
        // 1 will be stored in binary as 1 , takes 1 bit and returns the index of set bit i.e., 0
        // since the long stores values in 0-63 indices, to store next value the length wil increase by 64 bits, now the indices will be 64-127
    
        // 2 will be stored in binary as (1,0) takes 2 bits ,returns the index of set bit i.e., 65

        BitSet b2 = bitSet.valueOf(arr1);

        System.out.println(b2);
    }

}
