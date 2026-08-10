// Last updated: 8/10/2026, 11:21:27 AM
1class Solution {
2    public int smallestRangeII(int[] nums, int k) {
3        Arrays.sort(nums);
4        int r=nums[nums.length-1]-nums[0];
5        for(int i=0;i<nums.length-1;i++)
6        {
7           int min=Math.min(nums[0]+k,nums[i+1]-k);
8           int max=Math.max(nums[i]+k,nums[nums.length-1]-k);
9           r=Math.min(r,max-min);
10        }
11        return r;
12    }
13}