//program to print the diagnoal elements of the matrix
class DiagnoalElements{
    public static void main(String[] args){
        int arr[][]={{1,2,3,4,5},
                     {4,5,6,3,2},
                     {7,8,9,5,3},
                     {5,3,2,8,9},
                     {4,9,3,2,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j){
                System.out.print(arr[i][j]+" ");
                }
                else if(j==(arr.length)-i-1)
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}