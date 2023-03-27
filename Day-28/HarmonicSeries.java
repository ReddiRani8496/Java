//program to generate harmonic series
class HarmonicSeries{
    public static void main(String[] args){
        int n=5;
        double result=0;
        /*
        while(n>0){
            result+=(double) (1)/n;
            System.out.print(result+" ");
            n--;
        }
        */
        for(int i=n;i>0;i--){
            result+=(double)1/i;
            System.out.print(result+" ");
        }
    }
}