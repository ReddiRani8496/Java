class DuplicateCharacters{
    public static void main(String[] args){
        String str="java";
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                count++;
            }
           if(count>1){
            System.out.println("Duplicate");
            return;
           }
        }
         
    }
}