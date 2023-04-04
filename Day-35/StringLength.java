//program to find the length of the string using recursion
class StringLength{
    public static void main(String[] args){
        String str="rani";
        System.out.println(stringLength(str));
    }
    static int stringLength(String str){
        if(str.substring(0,1).equals("i"))
        return 0;
        return 1+stringLength(str.substring(1));
    }
}