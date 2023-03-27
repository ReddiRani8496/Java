import java.util.Arrays;
class Anagram{
    public static void main(String[] args){
        String str="javab";
        String str1="vajac";
         char c[]=str.toCharArray();
        char c1[]=str1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);
        if(str.length()!=str1.length()){
            System.out.println("Not a anagram");
            return;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]!=c1[i]){
                System.out.println("not a anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}