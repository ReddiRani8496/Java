/*revese words in sentence and find the middle element in the word
input:rock the world
output:r h co
*/
class WordMiddle{
    public static void main(String[] args){
        String str="rock the world";//dlrow eht kcor
       
           int end=str.length();
           for(int i=str.length()-1;i>=0;i--){
             String res="";
            if(str.charAt(i)==' '){
            for(int j=end-1;j>i;j--)
                res+=str.charAt(j);
               int len=res.length()/2;
                if(res.length()%2==0)
                 System.out.print(res.substring(len-1,len+1));
                else
                 System.out.print(res.substring(len,len+1));
            
            System.out.print(" ");
            end=i;
            }
            if(i==0){
                for(int j=end-1;j>=0;j--)
                res+=str.charAt(j);
                 int len=res.length()/2;
                 if(res.length()%2==0)
                   System.out.println(res.substring(len-1,len+1));
                else
                   System.out.println(res.substring(len,len+1));
            }
           }
    }
}

