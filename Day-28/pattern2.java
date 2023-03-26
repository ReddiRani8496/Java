/*program to print the following pattern
   1
  2 3
 4   5
6789134
*/
class pattern2{
    public static void main(String[] args){
        int arr[][]={{1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i==0&&(j==arr.length/2))||(j==(arr.length/2-i))||(j==arr.length/2+i)||i==arr.length/2)
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}