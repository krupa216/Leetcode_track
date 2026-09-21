// Last updated: 9/21/2026, 12:01:50 PM
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Arrays.sort(nums);
4        int c=1;
5        for(int i=0;i<nums.length;i++)
6        {
7            if(c==nums[i])
8            {
9                c++;
10
11            }
12            else if(nums[i]>c)
13            {
14                return c;
15            }
16        }
17        return c;
18    }
19}