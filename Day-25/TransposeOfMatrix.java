//program to find the transpos of the given matrix

class TransposeOfMatrix{
    public static void main(String[] args){
        int a[][]={{1,2,3},
                   {4,5,6}};
        int n=a[0].length;
        int m=a.length;
        int c[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                c[i][j]=a[j][i];
            }
        }
       for(var x:c){
            for(var y:x)
            System.out.print(y+" ");
            System.out.println();
        }
    }
}