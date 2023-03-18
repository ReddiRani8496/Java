/*program to print the particular character in the string
String str="hello";
str.charAt(3);=> l
*/
class StringCharAt{
    public static void main(String[] args){
        String str="hello";
        System.out.println(str.charAt(3));
        for(int i=0;i<str.length();i++)
        System.out.println(str.charAt(i));
    }
}