public class ArraySum{
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};
        int target=3;
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                    flag=true;
                }
                if(flag==true)
                    return;
           }
        }
    }
}
