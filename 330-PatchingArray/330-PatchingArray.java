// Last updated: 7/14/2026, 2:03:08 PM
class Solution {
    public int minPatches(int[] nums, int n) {
        long csum=1;
        int p=0;
        int i=0;
        while(csum<=n)
        {
            if(i<nums.length && nums[i]<=csum)
            {
                csum+=nums[i];
                i++;
            }
            else{
                csum+=csum;
                p++;
            }
        }
        return p;
    }
}