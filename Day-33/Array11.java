//program to compute the occurance of 11 in the array
class Array11{
    public static void main(String[] args){
        int arr[]={11,2,11};
        int index=0;
        System.out.println(array11(arr,index));
    }
    static int array11(int[] nums, int index) {
  if(index==nums.length)
  return 0;
  if(nums[index]==11)
  return 1+array11(nums,index+1);
  return array11(nums,index+1);
  
}

}