// Last updated: 9/6/2026, 4:27:45 PM
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