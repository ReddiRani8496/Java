class Matching{
    public static void main(String[] args){
        String str="abbc";
        String str1="baac";
        if(str.length()!=str1.length()){
            System.out.print("Not matching");
        return;
        }
        int s1=0,s2=0;
        for(var x:str.toCharArray()){
            s1+=x;
        }
        for(var x:str1.toCharArray()){
            s1+=x;
        }
        if(s1==s2)
        System.out.println("matching");
        else
        System.out.println("not matching");

    }
}