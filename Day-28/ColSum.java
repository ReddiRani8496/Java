//program to found the sum of all columns and maximum column in the array
class ColSum{
    public static void main(String[] args){
        int arr[][]={{6,3,9},
                     {4,8,5},
                     {1,4,2}};
        int index=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[0].length;j++){
                sum+=arr[j][i];
            }
           System.out.println("column "+i+" sum is="+sum);
            if(sum>max){
                max=sum;
                index=i;
            }
        }
        System.out.println("Maximum column sum is="+max+" found at column="+index);
    }
}