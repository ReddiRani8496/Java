//program to check whether the given array is in arithmetic progression or not
class ArithmeticProgression{
    public static void main(String[] args){
        int arr[]={2,4,6,8};  //the array is AP
      //  int arr[]={3,6,7,9}; //the array is not in AP
        int diff=arr[0]-arr[1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]-arr[i+1]!=diff){
            System.out.println("The array is not in arithmetic progression");
            return;
        }
        }
        System.out.println("The Array is in Arithmetic Progression");
    }
}