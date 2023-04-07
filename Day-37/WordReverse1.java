/*input: rock the world
output:kcor eht dlrow
*/
class WordReverse1{
    public static void main(String[] args){
        String str="rock the world";
        int end=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
            for(int j=i-1;j>=end;j--)
            System.out.print(str.charAt(j));
            System.out.print(" ");
            end=i;
            }
            if(i==str.length()-1){
                for(int j=i;j>=end;j--)
                System.out.print(str.charAt(j));
            }

        }
    }
}