// Last updated: 10/13/2026, 12:24:17 PM
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        int[] c=new int[nums.length+nums.length];
4        int j=0;
5        for(int i=0;i<nums.length;i++)
6        
7        {
8            c[j]=nums[i];
9            j++;
10        }
11          for(int i=0;i<nums.length;i++)
12        
13        {
14            c[j]=nums[i];
15            j++;
16        }
17        return c;
18        
19    }
20}