//program to caluculate the difference of two matrices
class SubOfMatrices{
    public static void main(String[] args){
        int a[][]={  {1,2},
                     {4,5}};
        int b[][]={{8,9},
                   {0,4}};
        if((a.length!=b.length)||(a[0].length!=b[0].length)){
            System.out.println("Subtraction of two matrix is not possible");
            return;
        }
        int c[][]=new int[a.length][a[0].length];
           for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                c[i][j]=a[i][j]-b[i][j];
            }
        }
        for(var x:c){
            for(var y:x)
            System.out.print(y+" ");
            System.out.println();
        }
    }
}