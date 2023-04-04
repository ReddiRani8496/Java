//Given a string and a non-empty substring sub, compute recursively if at least n copies of sub appear in the string somewhere, possibly with overlapping. 
class StrCopies{
    public static void main(String[] args){
        String str="catcow";
        String sub="cat";
        int n=2;
        System.out.println(strCopies(str,sub,n));
    }
    static boolean strCopies(String str,String sub,int n){
        int sublen=sub.length();
        if(n==0)
        return true;
        if(str.length()<sublen)
        return false;
        if(str.substring(0,sublen).equals(sub))
        return strCopies(str.substring(1),sub,n-1);
        return strCopies(str.substring(1),sub,n);
    }
}