// Last updated: 8/1/2026, 8:03:26 PM
1class Solution {
2    public int[] twoSum(int[] nums, int t) {
3        int[] a=new int[2];
4        int j=nums.length-1;
5        int i=0;
6        while(i<j)
7        {
8            int s=nums[i]+nums[j];
9            if(nums[i]+nums[j]==t)
10            {
11                a[0]=i+1;
12                a[1]=j+1;
13                return a;
14            }
15           else if(s<t)
16            {
17                i++;
18            }
19          else
20          {
21            j--;
22          }
23        }
24        return a;
25    }
26}