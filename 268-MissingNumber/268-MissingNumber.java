// Last updated: 7/14/2026, 2:03:20 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int tar=n*(n+1)/2;
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            c+=nums[i];
        }
        return tar-c;
    }
}