class CountABC{
    public static void main(String[] args){
        String str="abcxxaba";
        System.out.println(countABC(str));
    }
    static int countABC(String str){
        if(str.length()<=2)
        return 0;
        if(str.substring(0,3).equals("abc")||str.substring(0,3).equals("aba"))
        return 1+countABC(str.substring(2));
        return countABC(str.substring(1));
    }
}