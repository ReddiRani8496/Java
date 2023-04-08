class peak{
    public static void main(String[] args){
        int arr[]={8,3,5,1,9};
        int len=arr.length;
        if(len==0)
        return;
        if(len==1){
            System.out.println(arr[0]);
            return;
        }
        for(int i=1;i<len-1;i++){
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                
            }
        }
        if(arr[len-1]>arr[len-2]){
            System.out.println(arr[len-1]);
            return;
        }
    }
}