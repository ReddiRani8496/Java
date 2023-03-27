//program to find the rows sum in the array
class RowSum{
    public static void main(String[] args){
        int arr[][]={{1,2,3},
                     {4,5,9},
                     {8,3,0}};
        int max=Integer.MIN_VALUE,index=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            System.out.println("Row "+i+" sum is:"+sum);
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        System.out.println("the max  sum is: "+max+" found at row "+index);
    }
}