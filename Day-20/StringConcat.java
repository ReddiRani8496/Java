/*program to concat two strings
str1="java"
str2="world"
str3="java world"
*/
class StringConcat{
    public static void main(String[] args){
        String str1="java ";
        String str2="world";
        String str3=str1.concat(str2);
        System.out.println(str3);
    }
}