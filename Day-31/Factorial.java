//program to find the factorial of a number using recursion
class Factorial{
    public static void main(String[] args){
        int n=3;
        int result=fact(n);
        System.out.println(result);
    }
    static int fact(int n){
        if(n<=0)
        return 1;
        return n*fact(n-1);
    }
}