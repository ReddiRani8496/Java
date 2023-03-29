class SumOfCharges{
    public static void main(String[] args){
        int n=3;
       int sum= charges(n);
        System.out.println(sum);
    }
    static int charges(int n){
        if(n==1)
        return 1;
      int  sum=n+charges(n-1);
        return sum;
    }
}