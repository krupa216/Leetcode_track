// Last updated: 8/25/2026, 7:03:38 PM
1class Solution {
2    public int missingMultiple(int[] nums, int k) {
3        HashSet<Integer> h=new HashSet<>();
4        for(int i=0;i<nums.length;i++)
5        {
6            h.add(nums[i]);
7        }
8        for(int i=1;i<101;i++)
9        {
10                  if(!h.contains(i*k))
11                  {
12                     return i*k;
13                  }
14        }
15        return 101;
16    }
17}