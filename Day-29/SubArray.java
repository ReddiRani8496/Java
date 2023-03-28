class SubArray{
    public static void main(String[] args){
      int arr[]={1,2,3,4};
      for(int k=0;k<arr.length;k++){
      for(int i=k;i<arr.length;i++){
        for(int j=k;j<=i;j++){
            System.out.print(arr[j]);
        }
        System.out.println();
      }
      }
    }
}