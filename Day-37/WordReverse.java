class WordReverse{
    public static void main(String[] args){
        String str="hi hello welcome";
        int end=str.length();
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==' '){
                for(int j=i+1;j<end;j++)
                    System.out.print(str.charAt(j));
                    System.out.print(" ");
                end=i;
            }
        
        if(i==0){
            for(int k=0;k<end;k++)
             
                System.out.print(str.charAt(k));
            }
        }
    }
}


 