/*program to print the following pattern
INPUT:
1 2 3 
4 5 6
7 8 9

OUTPUT:
1 2 3 6 5 4 7 8 9
*/
class ZigZag{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}
                    };
        int len=arr.length;
      
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[i].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[i].length-1;j>=0;j--)
                System.out.print(arr[i][j]+" ");
            }
            
        }
        
    }
}
