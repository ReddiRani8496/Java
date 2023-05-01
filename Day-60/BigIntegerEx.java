public class BigIntegerEx {
    public static void main(String[] args) {
        MyBigInteger1 a = new MyBigInteger1("123");
        MyBigInteger1 b = new MyBigInteger1("123");
        String res = a.addNums(b);
        System.out.println(res);
    }
}
class MyBigInteger1 {
    String value;
    MyBigInteger1(String s) {
        this.value = s;
    }
    public String addNums(MyBigInteger1 b) {
    String num1 = this.value;
    String num2 = b.value;
    int carry = 0;
    String sum = "";
    int i,j;
    for(i = num1.length()-1, j = num2.length()-1; i > -1 && j > -1; i--, j--) {
        int temp = Integer.parseInt(String.valueOf(num1.charAt(i)))
                   +Integer.parseInt(String.valueOf(num2.charAt(j)))+carry;
        sum += temp%10;
        carry = temp/10;
    }
   
    while(i > -1) {
        int temp = Integer.parseInt(String.valueOf(num1.charAt(i)))+carry;
        sum += temp%10;
        carry = temp/10;
        i--;
    }
    while(j > -1) {
        int temp = Integer.parseInt(String.valueOf(num2.charAt(j)))+carry;
        sum += temp%10;
        carry = temp/10;
        j--;
    }
    if(carry > 0)
    sum += carry;
    String rev = "";
    for(var x : sum.toCharArray()) {
        rev = x+rev;
    }
    return rev;
}
}
