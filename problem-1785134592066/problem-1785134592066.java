// Last updated: 7/27/2026, 12:13:12 PM
1class Solution {
2    public int findMin(int[] nums) {
3      int min=Integer.MAX_VALUE;
4      for(int i=0;i<nums.length;i++)
5      {
6        if(nums[i]<min)
7        {
8            min=nums[i];
9        }
10      }
11    return min;
12    }
13}