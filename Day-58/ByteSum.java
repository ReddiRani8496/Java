public class ByteSum {
    public static void main(String[] args) {
        String num1 = "7250";
        String num2 = "3800";
       System.out.println(addNums(num1, num2));
        
    }
    public static StringBuilder addNums(String num1 ,String num2) {
            byte carry = 0;
            String sum = "";
            int i,j;
            for(i = num1.length()-1, j = num2.length()-1; i > -1 && j > -1; i--, j--){
                byte temp = (byte)(Byte.parseByte(String.valueOf(num1.charAt(i)))
                           +Byte.parseByte(String.valueOf(num2.charAt(j)))+carry);
                sum += temp%10;
                carry = (byte)(temp/10);
            }
           
            while(i > -1){
                byte temp = (byte)(Byte.parseByte(String.valueOf(num1.charAt(i)))+carry);
                sum += temp%10;
                carry = (byte)(temp/10);
                i--;
            }
            while(j > -1){
                byte temp = (byte)(Byte.parseByte(String.valueOf(num2.charAt(j)))+carry);
                sum +=temp%10;
                carry = (byte)(temp/10);
                j--;
            }
            if(carry > 0)
            sum += carry;
            StringBuilder s = new StringBuilder(sum);
            s.reverse();
            return s;
    }
}
