//program to print the right angle traingle using matrix
class RightTrianglePattern{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {5,6,7},
                     {9,6,3}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(j==0||j==i||i==arr.length-1)
                    System.out.print(arr[i][j]+" ");
                else
                System.out.print("  ");
                
            }
            System.out.println();
        }
    }
}