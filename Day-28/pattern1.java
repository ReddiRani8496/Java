/*
program to print the following pattern
12345
 2345
  345
   45
    5
*/
class pattern1{
    public static void main(String[] args){
             int arr[][]={{1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5},
                     {1,2,3,4,5}};
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr[0].length;j++){
                    if(i==0||j>=(0+i)&&j<arr.length)
                    System.out.print(arr[i][j]+" ");
                    else
                    System.out.print("  ");
                
            }
            System.out.println();
        }
    }
}