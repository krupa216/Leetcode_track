// Last updated: 8/25/2026, 7:54:01 PM
1class Solution {
2    public int minimumDifference(int[] nums, int k) {
3        int min=Integer.MAX_VALUE;
4        Arrays.sort(nums);
5        for(int i=0;i<=nums.length-k;i++)
6        {
7          int d=nums[i+k-1]-nums[i];
8          min=Math.min(min,d);
9        }
10        return min;
11    }
12}