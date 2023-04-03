class EndX{
    public static void main(String[] args){
        String str="xxhixx";
        System.out.println(endX(str));
    }
    static String endX(String str){
        if(str.length()==0)
        return "";
        if(str.charAt(0)!='x')
        return str.charAt(0)+endX(str.substring(1));
        else
        return endX(str.substring(1))+"x";
    }
}