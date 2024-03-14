/**
 * RemoveDuplicates2
 */
public class RemoveDuplicates2 {

    public int removeDuplicates(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
         if(i<2 || nums[i]!=nums[count-2]) {
             nums[count++] = nums[i];
         }
        }
 
        return count;
     }
}