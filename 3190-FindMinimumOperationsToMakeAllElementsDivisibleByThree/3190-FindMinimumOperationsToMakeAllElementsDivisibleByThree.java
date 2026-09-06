// Last updated: 9/6/2026, 4:24:02 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%3!=0)
            {
               c++;
            }

        }
        return c;
    }
}