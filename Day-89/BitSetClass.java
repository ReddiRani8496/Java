import java.util.BitSet;

public class BitSetClass {
    public static void main(String[] args) {

        BitSet players = new BitSet();

        players.set(0,62,true);

        System.out.println(players.get(3)); 

        players.clear(3);

        System.out.println(players);

        System.out.println(players.length());

        System.out.println(players.size());

        BitSet players2 = new BitSet();

        players2.set(0,134,true);

        System.out.println(players2.size()); // takes size as 64bits, if length is greater than 64, then size is increased by 64 bits
        
        System.out.println(players2.length()); // returns the number of bits stored


    }
}
