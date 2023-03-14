class SpaceComplexity_nSquare{
    public static void main(String[] args){
        int rows=5;
        int col=5;
        int val=1;
        int arr[][]=new int[rows][col];
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=val;
                val++;
            }
        }
        System.out.println("The 2D array is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}