import java.math.BigInteger;
public class BigIntegerEx {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("10");
        BigInteger num2 = new BigInteger("20");
        BigInteger num3 = new BigInteger("10");
        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.mod(num2));
        System.out.println(num1.multiply(num2)); 
        System.out.println(num1.compareTo(num3)); //returns 0 if both numbers are equal
        System.out.println(num2.compareTo(num1)); //returns 1 if firstNumber greater than secondNumber
        System.out.println(num1.compareTo(num2)); //returns -1 if firstNumber less than secondNumber
        System.out.println(num2.longValue());  //returns the number
        System.out.println(num1.divide(num3));
        System.out.println(num1.equals(num2));
        System.out.println(num1.bitCount());
        System.out.println(num1.doubleValue());
        System.out.println(num1.floatValue());
        System.out.println(num1.max(num2));
        System.out.println(num1.pow(2));
        System.out.println(num1.sqrt());
        System.out.println(num1.remainder(num2));
        System.out.println(num1.or(num2));
    }
}
