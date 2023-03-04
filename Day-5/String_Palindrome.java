//program to check whether the string is palindrome or not
import java.util.Scanner;
class String_Palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string:");
        String word=sc.nextLine();
        String rev="";
        for(int i=word.length()-1;i>=0;i--){
            rev+=word.charAt(i);
        }
        if(rev.equals(word))
        System.out.println("palindrome");
        else
         System.out.println("not a palindrome");
    }
}