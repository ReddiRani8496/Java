public class MaxSpan {
    public int maxSpan(int[] nums) {
        int max = 0;
        
        for(int i=0;i<nums.length;i++) {
          int cur = nums[i];
          int index = i;
          
          for(int j=i+1;j<nums.length;j++) {
            if(nums[j]==cur) {
              index = j;
            }
          }
          
          int elements = index-i+1;
          
          if(elements > max) {
            max = elements;
          }
          
        }
        return max;
      }
      
}
