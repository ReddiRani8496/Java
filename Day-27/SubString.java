class SubString{
    public static void main(String[] args){
        String str="hello world";
        String str1="llo wor";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==str1.charAt(0)){
                int k=i+1;int c=0;
                for(int j=1;j<str1.length();j++){
                    if(str1.charAt(j)!=str.charAt(k)){
                        c++;
                        break;
                    }
                    k++;
                }
                if(c==0){
                    System.out.println("Yes");
                    return;
                }
            }
        }
        System.out.println("no");
    }
}
