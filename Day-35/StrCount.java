class StrCount{
    public static void main(String[] args){
        String str="catcowcat";
        String sub="cow";
        System.out.println(strCount(str,sub));
    }
    static int strCount(String str,String sub){
        if(str.length()<sub.length())
        return 0;
        if(str.substring(0,sub.length()).equals(sub))
        return 1+strCount(str.substring(sub.length()),sub);
        return strCount(str.substring(1),sub);
    }
}