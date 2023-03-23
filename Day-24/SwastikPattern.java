class SwastikPattern{
    public static void main(String[] args){
        int arr[][]={{1,2,3,4,5,9,8},
                     {5,4,2,4,1,5,3},
                     {1,2,3,4,5,9,2},
                     {9,8,5,7,3,1,7},
                     {4,0,8,3,2,4,0},
                     {8,0,3,2,8,3,5},
                     {6,3,6,9,2,3,4}};
        for(int i=0;i<1;i++){
            for(int j=0;j<arr[i].length;j++){
                if(j<((arr.length/2)+1)||j==(arr.length-1))
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<=(arr.length/2)-1;i++){
            for(int j=0;j<arr.length;j++){
                if((j==(arr.length/2))||j==arr.length-1)
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=(arr.length/2);i<=(arr.length/2);i++)
        {
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
        System.out.println();
        for(int i=1;i<=(arr.length/2)-1;i++){
            for(int j=0;j<arr.length;j++){
                if((j==(arr.length/2))||j==0)
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=arr.length-1;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(j==0||(j>=(arr.length/2)&&j<arr.length))
                System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
            }
        }
        System.out.println();

    }
}