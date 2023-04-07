/*input: rock the world
output: dlrow eht kcor
*/
class Sentence_WordReversal{
    public static void main(String[] args){
        String str="rock the world";
           int end=str.length();
           for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
            for(int j=end-1;j>=i;j--)
            System.out.print(str.charAt(j));
            System.out.print(" ");
            end=i;
            }
            if(i==0){
                for(int j=end;j>=0;j--)
                System.out.print(str.charAt(j));
            }
           }
    }
}