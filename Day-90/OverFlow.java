public class OverFlow {
    public static void main(String[] args) {

        int a = 128;

        byte b = (byte) a; // the range of byte is 127 to -128, if we try to store 128 in byte, it is called overflow, and byte stores -128


        System.out.println(b);

        byte b1 = (byte)129; 

        System.out.println(b1);

        short s1 = (short) 32768;
        
        System.out.println(s1);
    }
    
}
