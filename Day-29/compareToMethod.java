//program to compare two strings using compare to method
class compareToMethod{
    public static void main(String[] args){
        String str="java";
        String str1="java";
        System.out.println(str.compareTo(str1));//if second string is substring of first string, then returns the length difference
        String str2="java";
        String str3="java programming";
        System.out.println(str2.compareTo(str3));//java is substring of str2 , then retunrs the legth difference
        String str4="java";
        String str5="lava";
        System.out.println(str4.compareTo(str5)); //str5 is not substring of str4, so it compares the ASCII code difference i.e., j=106,l=108; 106-108=-2
    }
}