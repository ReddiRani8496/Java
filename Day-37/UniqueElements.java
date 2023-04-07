class UniqueElements{
    public static void main(String[] args){
        int arr[]={1,2,3,5,3,4,8,2};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                break;
                else
                System.out.println(arr[i]);
            }
        }
    }
}