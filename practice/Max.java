class Max{
    public static void main(String[] args){
        int arr[]={4,5,8,2,9,3};
        int len=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++){
        if(arr[i]>max)
        max=arr[i];
        }
        System.out.println(max);
    }
}