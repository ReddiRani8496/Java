/*program to compute recursively if the array contains somewhere a value followed in the array by that value times 10.
 We'll use the convention of considering only the part of the array that begins at the given index
 */
class Array220{
    public static void main(String[] args){
        int nums[]={3,20,2};
        int index=0;
        System.out.println(array220(nums,index));
    }

static boolean array220(int[] nums, int index) {
  if(index>=nums.length-1)
  return false;
  if(nums[index]*10==nums[index+1])
  return true;
  return array220(nums,index+1);
}
}