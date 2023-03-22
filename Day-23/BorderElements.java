class BorderElements{
    public static void main(String[] args){
        int arr[][]={{1,2,3,4},
                     {5,6,7,8},
                     {4,5,2,8},
                     {3,9,5,1}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            if(i==0||j==arr[i].length-1||j==0||i==arr.length-1)
            System.out.print(arr[i][j]+" ");
            else 
            System.out.print("  ");
        }
        System.out.println();
        }
    }
}