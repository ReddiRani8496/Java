class Hpattern{
    public static void main(String[] args){
        int arr[][]={{1,2,3,8,0,5,4},
                     {4,5,8,0,7,9,7},
                     {7,9,5,3,1,0,2},
                     {5,8,3,5,9,1,0},
                     {1,0,3,9,8,4,3},
                     {9,4,5,6,3,2,8},
                     {9,4,5,8,3,5,2}
                     };
        for(int i=0;i<arr.length;i++){
          for(int j=0;j<arr[0].length;j++){
            if(j==(arr[0].length-1)||j==0||i==(arr.length/2))
            System.out.print(arr[i][j]+" ");
            else 
            System.out.print("  ");
          }
          System.out.println();
        }
        
    }
}