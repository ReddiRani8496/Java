class BracketsComparision{
    public static void main(String[] args){
        String str="()))[]";
        int opens=0;
        int closes=0;
        int mismatch=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
            opens++;
            else if(str.charAt(i)==')'){
                if(opens>0){
                opens--;
                closes++;
            }
                else{
                 mismatch++;
                
                }
                 if(closes>0)
                 closes--;
            }
        }
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='[')
            opens++;
            else if(str.charAt(i)==']'){
                if(opens>0){
                opens--;
                closes++;
            }
                else{
                 mismatch++;
                 if(closes>0)
                 closes--;
                 }
            }
        }
        System.out.println("opens="+opens+"closes="+closes+"mismatch="+mismatch);
    }
}