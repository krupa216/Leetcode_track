// Last updated: 7/14/2026, 2:03:36 PM
class Solution {
    public int rob(int[] nums) {
        int s=0;
        int max=0;
        for(int i:nums)
        {
           int t=Math.max(max,s+i);
           s=max;
           max=t;
        }
        return max;
    }
}