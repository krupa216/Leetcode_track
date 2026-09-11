// Last updated: 9/11/2026, 12:02:38 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int z=0;
4        int s=0;
5        int max=0;
6        for(int i=0;i<nums.length;i++)
7        {
8            if(nums[i]==0)
9            {
10                z++;
11            }
12            while(z>k)
13            {
14                if(nums[s]==0)
15                {
16                    z--;
17                  
18                }
19                  s++;
20            }
21           max=Math.max(max,i-s+1);
22        }
23        return max;
24    }
25}