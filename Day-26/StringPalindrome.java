//program to check whether the string is palindrome or not
class StringPalindrome{
    public static void main(String[] args){
        String str="abbac";
        int len=str.length();
        for(int i=0;i<len/2;i++){
            if(str.charAt(i)!=str.charAt(len-i-1)){
                System.out.println("not a palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}