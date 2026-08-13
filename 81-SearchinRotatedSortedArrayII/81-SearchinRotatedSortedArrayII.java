// Last updated: 8/13/2026, 12:17:30 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        for(int i=0;i<nums.length;i++)
4        {
5            if(nums[i]==target)
6            {
7                return true;
8            }
9        }
10        return false;
11    }
12}