//program to caluculate the sum of two matrix
import java.util.Arrays;
class SumOfMatrices{
    public static void main(String[] args){
        int a[][]={{1,2,3},
                   {4,5,6}};
        int b[][]={{3,8,5},
                   {1,9,4}};
        int c[][]=new int[a.length][a[0].length];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
           
        }
      for(var x:c){
        for(var y:x)
        System.out.print(y+" ");
        System.out.println();
      }
    }
}