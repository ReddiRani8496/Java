//In most programming competitions, we are required to answer the result in 10^9+7 modulo
class Modulo{
    public static void main(String[] args) {
        byte a = 100;

        byte b = 50;

        System.out.println(a+b);

        //byte c=a+b; error cannot convert int to byte
        
        byte c = (byte)((a+b)%1000000007);

        System.out.println(c);
    }
}