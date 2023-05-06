public class MyBigInteger2 {
    public static void main(String[] args) {
       BigInteger1 b = new BigInteger1("420");
       b.print(); 
    }
}
class BigInteger1 {
    String value;
    BigInteger1(String s) {
        this.value = s;
    }
    void print() {
        BigInteger1 m = new BigInteger1("123");
        //m = new BigInteger1("230"); o/p : 230 
        System.out.println(m.value);
    }
}
