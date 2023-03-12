class TwoElementsSum{
    public static void main(String[] args){
        int arr[]={7,4,9,5,3};
        int sum=9;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum){
                    System.out.println("sum found by adding the elements at arr("+i+","+j+")");
                    return;
                }
            }
        }
        System.out.println("Sum not found");
    }
}