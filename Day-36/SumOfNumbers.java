//program to find the sum of numbers 1 to n
class SumOfNumbers{
    public static void main(String[] args){
        int n=10;
        System.out.println(sum(n,1));
    }
    static int sum(int n,int start){
        if(start>n)
        return 0;
        return start+sum(n,start+1);
    }
}