// Last updated: 8/10/2026, 11:32:38 AM
1class Solution {
2    public int smallestRangeII(int[] nums, int k) {
3        Arrays.sort(nums);
4        int r=nums[nums.length-1]-nums[0];
5        int min=nums[0]+k;
6        int max=nums[nums.length-1]-k;
7        for(int i=0;i<nums.length-1;i++)
8        {
9           
10            int max1=Math.max(max,nums[i]+k);
11           int min2=Math.min(min,nums[i+1]-k);
12           r=Math.min(r,max1-min2);
13        }
14        return r;
15    }
16}