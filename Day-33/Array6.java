//if the array contains 6 return true, otherwise return false
class Array6{
    public static void main(String[] args){
        int nums[]={2,4,8,6};
        int index=0;
        System.out.println(array6(nums,index));
    }

static boolean array6(int[] nums, int index) {
  if(index==nums.length)
  return false;
  if(nums[index]==6)
  return true;
  return array6(nums,index+1);
}
}
