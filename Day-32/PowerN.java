//program to compute recursively the value of base to the n power
class PowerN{
    public static void main(String[] args){
        int base=2;
        int n=2;
        System.out.println(powerN(base,n));
    }
    static int powerN(int base,int n){
        if (n==0||n==1)
        return base;
        return base*powerN(base,n-1);
    }
}