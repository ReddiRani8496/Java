/*input:"aaaeebbc"
output:a3e2b2c
*/
class CountChar{
    public static void main(String[] args){
        String str="aaaeebbc";
        String res="";
        for(int i=0;i<str.length();i++){
            int count=1;
            int j;
            for(j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                count++;
                else
                break;
            }
            if(count==1)
            res+=str.charAt(i);
            else
            res+=str.charAt(i)+Integer.toString(count);
            i=j-1;
           
        }
         System.out.println(res);
    }
}