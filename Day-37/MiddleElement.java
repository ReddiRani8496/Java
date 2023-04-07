class MiddleElement{
    public static void main(String[] args){
        String str="java";//avaj
        String res="";
        for(int i=str.length()-1;i>=0;i--){
                res+=str.charAt(i);
        }
        int len=res.length()/2;
        if(res.length()%2==0)
        System.out.println(res.substring(len-1,len+1));
        else
        System.out.println(res.substring(len,len+1));
    }
}