// Last updated: 7/14/2026, 2:04:24 PM
class Solution {
    public int search(int[] nums, int t) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==t)
            {
                return i;
            }
        }
        return -1;
    }
}