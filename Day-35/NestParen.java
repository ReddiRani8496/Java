class NestParen{
    public static void main(String[] args){
        String str="(()";
        System.out.println(nestParen(str));
    }
    static boolean nestParen(String str){
        int len=str.length();
        if(len==0)
        return true;
        if((len%2)!=0)
        return false;
        if(str.charAt(0)=='('&&str.charAt(len-1)==')')
        return nestParen(str.substring(1,len-1));
        else 
        return false;
    }
}