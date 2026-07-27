// Last updated: 7/27/2026, 2:23:33 PM
1class Solution {
2    public int maximumProduct(int[] nums) {
3        Arrays.sort(nums);
4       
5       int max=Math.max((nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]),(nums[0]*nums[1]*nums[nums.length-1]));
6        
7     
8         
9        return max;
10        
11        
12
13    }
14}