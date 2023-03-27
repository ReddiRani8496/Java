class Paragram{
    public static void main(String[] args){
        String str="abcdef";
        boolean res[]=new boolean[3];
        for(int i=0;i<str.length();i++){
            int index=str.charAt(i)-97;
            if(index>=0 && index<res.length)
            res[index]=true;
        }
        for(var a:res)
        System.out.print(a+" ");

    }
}


