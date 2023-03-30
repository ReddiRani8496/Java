class SnakePattern{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,6},
                     {7,8,9}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j%2==0){
                    System.out.print(arr[i][j]+" ");
                    
                }
            }
            
        }
        for(int i=arr.length;i<arr.length-1;i++){
            for(int j=1;j<arr.length;j++){
                System.out.print(arr[i][j]);
            }
        }
    }
}