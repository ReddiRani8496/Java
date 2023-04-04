//Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of 
//the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".
class ParenBit{
    public static void main(String[] args){
        String str="abc(xyz)def";
        System.out.println(parenBit(str));

    }
    static String parenBit(String str){
        if(str.length()<2)
        return "";
        if(str.charAt(0)=='('){
            int n=str.length();
            if(str.charAt(n-1)==')')
            return str;
            else
            return parenBit(str.substring(0,n-1));
        }
        return parenBit(str.substring(1));
    }
}