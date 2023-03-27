//program to find out the maximum sum in the array
class MaxSumInArray{
    public static void main(String[] args){
        int arr[][]={{4,3,8},
                     {5,1,0},
                     {3,4,2}};
        int max=Integer.MIN_VALUE;
        String pos="row";
        int index=-1;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[j][i];
            }
            if(sum>max){
                max=sum;
                index=i;
                pos="col";
            }
        }
        System.out.println("maximum sum is="+max+" found in "+pos+"="+index);
    }
}