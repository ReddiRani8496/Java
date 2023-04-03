class CountPairs{
    public static void main(String[] args){
        String str="axax";
        System.out.println(countPairs(str));
    }
    static int countPairs(String str){
        if(str.length()<3)
        return 0;
        if(str.charAt(0)==str.charAt(2))
        return 1+countPairs(str.substring(1));
        return countPairs(str.substring(1));
    }
}