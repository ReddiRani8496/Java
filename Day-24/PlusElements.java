/*program to print the plus shape elments in the array

  1
2 3 4
  5
*/
class PlusElements{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9},
                    };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(j==(arr[i].length/2)||i==(arr.length/2)){
                    System.out.print(arr[i][j]+" ");
                }
                else
                 System.out.print("  ");
            }
            System.out.println();
        }

    }
}