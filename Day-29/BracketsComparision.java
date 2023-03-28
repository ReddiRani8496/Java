class BracketsComparision{
    public static void main(String[] args){
        String str="()())[][";
        int opens=0;
        int closes=0;
        int mismatch=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
            opens++;
            else if(str.charAt(i)==')'){
                if(opens>0){
                opens--;
                }
                
            else{
                 mismatch++;
                 closes++;
                }
              
                  }
                
                 
                }
                 if(opens>=1)
                  mismatch++;
            for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='[')
            opens++;
            else if(str.charAt(i)==']'){
                if(opens>0){
                opens--;
            }
                else{
                 mismatch++;
                  closes++;
                 }
            }
          }
         if(opens>=1)
                  mismatch++;
        System.out.println("opens="+opens+"\tcloses="+closes+"\tmismatch="+mismatch);
    }
}