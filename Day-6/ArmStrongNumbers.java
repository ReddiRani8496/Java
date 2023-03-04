//program to print Armstrong numbers between 1 to 1000

class ArmStrongNumbers{
    public static void main(String[] args){
       for(int i=1;i<=500;i++){
        int n=i;
        int result=0;
        while(n>0){
            result+=Math.pow((n%10),3);
            n/=10;
        }
        if(result==i)
        System.out.println(i);
       } 
         
    }
}