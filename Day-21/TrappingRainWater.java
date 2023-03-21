class TrappingRainWater{
    public static void main(String[] args){
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int water=0;
        int len=arr.length;
        for(int i=1;i<len-1;i++){
            int leftMax=arr[i];
            for(int j=0;j<i;j++){
                if(arr[j]>leftMax)
                leftMax=arr[j];
            }
            int rightMax=arr[i];
            for(int k=i+1;k<len;k++){
                if(arr[k]>rightMax)
                rightMax=arr[k];
            }
            int min=Math.min(leftMax,rightMax);
            int waterCount=min-arr[i];
            water+=waterCount;
        }
        System.out.println(water);
    }
}