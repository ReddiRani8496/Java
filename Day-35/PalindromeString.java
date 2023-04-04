class PalindromeString{
    public static void main(String[] args){
        String str="madam";
        System.out.println(palindromeString(str));
    }
    static boolean palindromeString(String str){
        int len=str.length();
        if(len<=1)
        return true;
        if(str.charAt(0)==str.charAt(len-1))
        return palindromeString(str.substring(1,len-1));
        return false;
    }
}