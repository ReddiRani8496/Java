import java.util.BitSet;

public class ToByte {
    
    public static void main(String[] args) {

        BitSet bitSet = new BitSet();

        bitSet.set(23);

        bitSet.set(45); // stores in 40-47 bits range, length = 6

        bitSet.set(10);


        byte[] arr = bitSet.toByteArray();

        System.out.println(arr.length);

        System.out.println(arr[1]);

    }


}
