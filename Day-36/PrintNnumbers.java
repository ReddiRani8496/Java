//program to print 1 to n numbers using recursion
class PrintNnumbers{
    public static void main(String[] args){
        int n=10;
        print(n,1);
    }
    static int print(int n,int start){
        if(start>n)
        return 0;
        System.out.print(start+" ");
       return print(n,start+1);
    }
}