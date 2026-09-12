// Last updated: 9/12/2026, 11:44:32 AM
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        HashSet<Integer> h=new HashSet<>();
4        int max=0;
5        int j=0;
6        int sum=0;
7        for(int i=0;i<nums.length;i++)
8        {
9            while(h.contains(nums[i]))
10            {
11                  h.remove(nums[j]);
12                  sum-=nums[j];
13                  j++;
14            }
15            h.add(nums[i]);
16            sum+=nums[i];
17            max=Math.max(max,sum);
18        }
19       
20        return max;
21    }
22}