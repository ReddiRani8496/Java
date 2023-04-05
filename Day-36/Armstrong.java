//program to check whether a number is armstrong or not using recursion
class Armstrong{
    public static void main(String[] args){
        int n=153;
       int m=n;
       int sum=0;
       System.out.println(armstrong(n,m,sum));
    }
    static boolean armstrong(int m,int n,int sum){
        if(m==0)
        return false;
        sum+=(m%10)*(m%10)*(m%10);
        if(sum==n)
        return true;
        return armstrong(m/10,n,sum);
    }
}