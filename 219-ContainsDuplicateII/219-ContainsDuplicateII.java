// Last updated: 9/17/2026, 11:27:52 AM
1class Solution {
2    public boolean containsNearbyDuplicate(int[] nums, int k) {
3      HashSet<Integer> h=new HashSet<>();
4        for(int i=0;i<nums.length;i++)
5        {
6           
7                if(h.contains(nums[i]))
8                
9                {
10                   return true;       
11                }
12            h.add(nums[i]);
13            if(h.size()>k)
14            {
15                h.remove(nums[i-k]);
16            }
17        }
18        return false;
19    }
20}