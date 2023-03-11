//program to find the lonely integer in the array
class LonelyInteger_InArray{
    public static void main(String[] args){
        int arr[]={3,4,3,5,4};
        int result=arr[0];
        for(int i=1;i<arr.length;i++)
        result=result^arr[i];
        System.out.println(result);
    }
}