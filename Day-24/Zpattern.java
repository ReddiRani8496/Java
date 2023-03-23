//program to print the Z pattern
class Zpattern{
public static void main(String[] args){
    int arr[][]={{1,2,3,4,5},
                {4,5,6,2,3},
                {7,8,9,5,4},
                {4,2,9,8,4},
                {8,4,3,0,2}};
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(i==0||i==arr.length-1||j==(arr.length-i-1))
             System.out.print(arr[i][j]+" ");
             else
             System.out.print("  ");
        }
        System.out.println();
    }
}
}