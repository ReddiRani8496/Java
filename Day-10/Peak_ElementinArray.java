class Peak_ElementinArray{
    public static void main(String[] args){
        int arr[]={8,9,10};
        int n=arr.length;
        if(n==0)
        return;
        if(n==1){
        System.out.println(arr[0]);
        return;
        }
        for(int i=1;i<n-1;i++){
            if(arr[i]>=arr[i-1]&& arr[i]>=arr[i+1])
            System.out.println(arr[i]);
        }
        if(arr[n-1]>arr[n-2]){
        System.out.println(arr[n-1]);
        return;
        }
    }
}