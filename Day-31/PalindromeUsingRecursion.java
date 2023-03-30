class PalindromeUsingRecursion{
    public static void main(String[] args){
        String str="rotator";
        System.out.print(fact(str));

    }
    static boolean fact(String str){
        int len=str.length();
        if(len==0||len==1)
        return true;
        if(str.charAt(0)!=str.charAt(len-1))
        return false;
        return fact(str.substring(1,len-1));
    }
}