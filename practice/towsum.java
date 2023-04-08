class towsum{
    public static void main(String[] args){
        int arr[]={3,4,1,8,5,7,9};
        int sum=6;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
            if(arr[i]+arr[j]==sum){
                System.out.println(arr[i]+" "+arr[j]);
                return;
            }
        }
    }

}