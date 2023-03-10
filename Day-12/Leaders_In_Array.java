class Leaders_In_Array{
    public static void main(String[] args){
        int arr[]={16,17,4,3,5,2};
        int len=arr.length;
        int max=arr[len-1];
        for(int i=len-1;i>=0;i--){
            if(arr[i]>=max){
            
            max=arr[i];
            System.out.print(arr[i]+"\t");
        }}
    }
}