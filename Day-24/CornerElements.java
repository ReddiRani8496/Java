/*program to print the corner elements of the array
1  3

4  5
*/
class CornerElements{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {7,8,9},
                     {4,7,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if((i==0&&j==0)||(i==arr.length-1&&j==0)||(i==arr.length-1&&j==arr[i].length-1)||(i==0&&j==arr[i].length-1))
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}