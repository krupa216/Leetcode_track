// Last updated: 7/14/2026, 2:02:40 PM
class Solution {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target==nums[i])
            {
                return i;
            }
        }
        return -1;
    }
}