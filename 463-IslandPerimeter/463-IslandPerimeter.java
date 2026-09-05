// Last updated: 9/5/2026, 8:34:18 PM
1class Solution {
2    public int findMaxConsecutiveOnes(int[] nums) {
3        int max=0;
4        int c=0;
5        for(int i=0;i<nums.length;i++)
6        {
7           if(nums[i]==1)
8           {
9            c++;
10           }
11           else 
12           {
13           max= Math.max(max,c);
14           c=0;
15           }
16        }
17        return Math.max(max,c);
18    }
19}