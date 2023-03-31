//program to return the count of the occurances of 7 as a digit, for example 767 yields 2.
class Count7{
    public static void main(String[] args){
        int n=707;
        System.out.println(count7(n));
    }
    static int count7(int n){
        if(n==0)
        return 0;
        if((n%10)==7)
        return 1+count7(n/10);
        return count7(n/10);
    }
}