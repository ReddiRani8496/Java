class Intersection{
    public static void main(String[] args){
        int arr[]={3,2,1,8};
        int arr1[]={8,4,5,1};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                System.out.println(arr[i]);
                break;
                }
            }
        }
    }
}