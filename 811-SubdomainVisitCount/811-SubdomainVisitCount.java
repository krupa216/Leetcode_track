// Last updated: 8/31/2026, 1:49:49 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        int sum=0;int c=0;
4        for(int i=0;i<nums.length;i++)
5        {
6            sum=0;
7            for(int j=i;j<nums.length;j++)
8            {
9                sum+=nums[j];
10                if(sum==k)
11                {
12                    c++;
13                }
14            }
15        }
16        return c;
17    }
18}