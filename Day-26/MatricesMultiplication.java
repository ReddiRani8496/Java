//program to multiply the two matrix
class MatricesMultiplication{
    public static void main(String[] args){
        int a[][]={{1,2},
                     {4,5}};
        int b[][]={{1,2},
                   {3,4}};
        int c[][]=new int[a.length][b[0].length];
        int sum=0;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<b[0].length;j++){
                for(int k=0;k<a[0].length;k++){
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
           
        }
        for(var x:c){
            for(var y:x)
            System.out.print(y+" ");
            System.out.println();
        }
    }
}