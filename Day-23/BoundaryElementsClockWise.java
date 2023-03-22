//program to print the boundary elements of the given matrix in a clockwise form
class BoundaryElementsClockWise{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==0||j==arr[i].length-1){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
                }
            }
        }
        for(int i=arr.length-1;i>0;i--){
            for(int j=arr[i].length-2;j>=0;j--){
                if(j==0||i==arr[i].length-1){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
                }
            }
        }
        System.out.println("\n"+sum);
    }
}