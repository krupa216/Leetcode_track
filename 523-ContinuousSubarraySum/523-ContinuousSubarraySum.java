// Last updated: 8/28/2026, 10:14:26 AM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        Set<Integer> h=new HashSet<>();
4        int c=0;
5        int ps=0;
6
7        for(int i:nums)
8        {
9            c+=i;
10            if(h.contains(c%k))
11            {
12                return true;
13            }
14            c%=k;
15            h.add(ps);
16            ps=c;
17        }
18        return false;
19    }
20}