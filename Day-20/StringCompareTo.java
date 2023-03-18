/*program to compare two strings
if both the strings are equal, then output will be 0,
else it will return the difference.
*/
class StringCompareTo{
    public static void main(String[] args){
        String str="java";
        String str1="javac";
        String str3="java";
        System.out.println(str.compareTo(str1));
        System.out.println(str.compareTo(str3));

    }
}