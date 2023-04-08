class bise{
    public static void main(String[] args){
        int arr[]={2,4,8,9,15,18};
        int x=5;
        int low=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            int mid=(low+end)/2;
            if(arr[mid]==x){
                System.out.println("Element found");
                return;
            }
            else if(arr[mid]>x)
             end=mid-1;
             else
             low=mid+1;

        }
        System.out.println("Element not found");
    }
}