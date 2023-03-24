class EvenOddPattern{
    public static void main(String[] args){
         int arr[][]={{1,2,3,4},
                     {5,3,8,9},
                     {0,5,6,7},
                     {3,4,2,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i%2==0)&&(j%2!=0))
                    System.out.print(arr[i][j]+" ");
                else if((i%2!=0)&&(j%2==0))
                System.out.print(arr[i][j]+" ");
                else 
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}