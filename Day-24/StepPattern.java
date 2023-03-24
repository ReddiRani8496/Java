class StepPattern{
    public static void main(String[] args){
        int arr[][]={{1,2,3,4},
                     {8,5,0,3},
                     {3,2,7,6},
                     {4,6,0,2}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j==i||j==(i+1))
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}