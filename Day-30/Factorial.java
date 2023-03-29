//program to find out the factorial of a number using recurssion
class Factorial{
    public static void main(String[] args){
        int n=4;
       int sum= fact(n);
        System.out.println(sum);
    }
    static int fact(int n){
        if(n==1)
        return 1;
        int sum=n*fact(n-1);
        return sum;
    }
}