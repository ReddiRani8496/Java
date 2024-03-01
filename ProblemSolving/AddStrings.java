public class AddStrings {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length()-1;
        int len2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(len1 >= 0 || len2 >= 0 || carry==1) {
            if(len1 >= 0) {
                carry += num1.charAt(len1) - '0';
                len1--;
            }
            if(len2 >= 0) {
                carry += num2.charAt(len2) - '0';
                len2--;
            }
            sb.insert(0,carry%10);
            carry = carry / 10;
        }
        return sb.toString();
    }
}
