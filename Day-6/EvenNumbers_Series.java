//program to compute sinx for given x. The user should supply x and a positive integer n. We compute the sin of x using the series and teh computation should use
//all terms in the series up through the term involving x^n
class EvenNumbers_Series{
    public static void main(String[] args){
        int n=5;
        int x=90;
        double x1=x*(3.14159/180.0);
        double result=0;
        int sign=1;
        for(int i=1,j=0;i<=n;i++,j+=2){
            result+=((sign*Math.pow(x1,j))/fact(j));
            sign *=-1;
        }
        System.out.println(result);
    }
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
         f*=i;
        return f;
    }
}