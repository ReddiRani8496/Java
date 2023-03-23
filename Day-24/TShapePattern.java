class TShapePattern{
    public static void main(String[] args){
        int arr[][]={{1,2,3,4,0},
                     {5,3,4,9,2},
                     {9,3,4,0,1},
                     {8,4,2,0,7},
                     {2,9,4,5,3}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(i==0||j==arr[0].length/2)
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}