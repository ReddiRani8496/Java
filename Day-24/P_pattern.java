class P_pattern{
    public static void main(String[] args){
         int arr[][]={{1,2,3,4,5},
                     {5,3,8,9,2},
                     {0,5,6,7,1},
                     {3,4,2,9,1},
                     {8,5,0,3,5}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j==0||(i<arr.length/2&&j==arr[0].length-1)||i==arr.length/2||i==0)
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}