// Last updated: 7/14/2026, 2:02:49 PM
class Solution {
    public int arrayPairSum(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i+=2)
        {
            Arrays.sort(nums);
            max+=nums[i];
        }
      return max;  
    }
}