// Last updated: 7/27/2026, 2:06:40 PM
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=0;
4      
5        for(int i=0;i<nums.length;i++)
6        {
7            for(int j=i+1;j<nums.length;j++)
8            {
9            if(((nums[i]-1)*(nums[j]-1))>max)
10            {
11               max=((nums[i]-1)*(nums[j]-1));
12            }
13            }
14           
15        }
16        return max;
17    }
18}