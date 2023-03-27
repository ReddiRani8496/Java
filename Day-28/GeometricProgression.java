//program to generate geometric progression
class GeometricProgression{
    public static void main(String[] args){
        int a=2;
        int r=2;
        int n=4;
         int term;
        for(int i=0;i<n;i++){
            term=a *(int)Math.pow(r,i);
            System.out.print(term+" ");
        }
    }
}