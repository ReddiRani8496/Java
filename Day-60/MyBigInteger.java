public class MyBigInteger {
    public static void main(String[] args) {
        MyBigIntegerEx num1 = new MyBigIntegerEx("123");
        MyBigIntegerEx num2 = new MyBigIntegerEx("123");
        String sum = MyBigIntegerEx.addNums(num1,num2);
        System.out.println(sum); 
    }
}
class MyBigIntegerEx {
    String value;
    MyBigIntegerEx(String s) {
        this.value = s;
    }
    public static String addNums(MyBigIntegerEx a,MyBigIntegerEx b) {
        String num1 = a.value;
        String num2 = b.value;
        int carry = 0;
        String sum = "";
        int i,j;
        for(i = num1.length()-1, j = num2.length()-1; i > -1 && j > -1; i--, j--){
            int temp = Integer.parseInt(String.valueOf(num1.charAt(i)))
                       +Integer.parseInt(String.valueOf(num2.charAt(j)))+carry;
            sum += temp%10;
            carry = temp/10;
        }
       
        while(i > -1){
            int temp = Integer.parseInt(String.valueOf(num1.charAt(i)))+carry;
            sum += temp%10;
            carry = temp/10;
            i--;
        }
        while(j > -1){
            int temp = Integer.parseInt(String.valueOf(num2.charAt(j)))+carry;
            sum +=temp%10;
            carry = temp/10;
            j--;
        }
        if(carry > 0)
        sum += carry;
        String res="";
        for(var x : sum.toCharArray()){
            res = x+res;
        }
        return res;
    }
}
