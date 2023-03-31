//program to compute recursively the number of lowercase 'x'chars in the string.
class CountX{
    public static void main(String[] args){
        String str="xxhixx";
        System.out.println(countX(str));
    }
    static int countX(String str){
        if(str.substring.equals(str.length()-1,str.length()))
        return "";
       if(str.substring(0,1).equals("x"))
       return 1+count(str);
    }
}