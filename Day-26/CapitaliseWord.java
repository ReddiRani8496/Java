//program to capitalise the starting letter of the word
class CapitaliseWord{
    public static void main(String[] args){
        String str="hello welcome to programming";
        boolean flag=true;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>64&&str.charAt(i)<91)  
            System.out.print(str.charAt(i));  
            else if(flag==true){
                System.out.print((char)(str.charAt(i)-32));
                flag=false;
            }
            else if(str.charAt(i)==' '){
                System.out.print(" ");
                flag=true;
            }
            else{
                System.out.print(str.charAt(i));
            }
                }
    }
}