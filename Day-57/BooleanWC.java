public class BooleanWC {
    public static void main(String[] args) {

        Boolean b = Boolean.parseBoolean("true");

        System.out.println(b);

        int b1 = Boolean.compare(false, true);

        System.out.println(b1);

        Boolean b2 = Boolean.logicalAnd(5<6, 2>1);

        System.out.println(b2);

        Boolean b3 = Boolean.logicalOr(8>1, 4<3);

        System.out.println(b3);

        Boolean b4 = Boolean.logicalXor(7>8, 9<7);

        System.out.println(b4);

        Boolean b5 = Boolean.valueOf("hello");

        System.out.println(b5);

        String a = Integer.toBinaryString(98445);
        
        System.out.println(a);
    }
}
