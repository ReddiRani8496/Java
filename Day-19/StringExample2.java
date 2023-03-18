class StringExample2{
    public static void main(String[] args){
        String str1="java";
        String str2=" ";
        for(int i=0;i<str1.length();i++){
            if(i!=2)
             str2+= str1.charAt(i);
             else
             str2+='w';
        }
        System.out.println(str1);
        System.out.println(str2);
    }
}