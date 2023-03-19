class TripletSum{
    public static void main(String[] args){
        int arr[]={4,3,8,9,2,5,1};
        int len=arr.length;
        int sum=6;
        for(int i=0;i<len-2;i++){
            for(int j=i+1;j<len-1;j++){
                for(int k=j+1;k<len;k++){
                    if(arr[i]+arr[j]+arr[k]==sum)
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                }
            }
        }
    }
}