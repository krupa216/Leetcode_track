// Last updated: 9/6/2026, 4:25:20 PM
class Solution {
    public boolean check(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>nums[(i+1)% nums.length])
            {
                c++;
            }
        }
        return c<=1;
    }
}