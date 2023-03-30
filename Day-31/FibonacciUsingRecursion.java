//program to print the fibonacci series using recursion
class FibonacciUsingRecursion{
    public static void main(String[] args){
        int n=4;
       int res= fibonacci(n);
       System.out.println(res);
    }
    static int fibonacci(int n){
        if(n==0||n==1||n==2)
        return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}