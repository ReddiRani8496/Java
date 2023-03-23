//program to find sum of all boundary and diagonal element of a matrix
class SumOfDiagonalElements{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {1,4,3}};
        int firstSum=0;int secondSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(i==j)
                 firstSum+=arr[i][j];
                 if(j==(arr.length-i-1))
                 secondSum+=arr[i][j];
            }
        }
        System.out.println("Sum of first diagonal="+firstSum+"\n"+"sum of second diagonal="+secondSum);
    }
}