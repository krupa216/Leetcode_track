// Last updated: 7/29/2026, 11:50:56 AM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        for(int i=0;i<nums.length;i++)
4        {
5            if(nums[i]==0)
6            {
7                nums[i]=-1;
8            }
9        }
10        Map<Integer,Integer> h=new HashMap<>();
11        h.put(0,-1);
12        int sum=0;int max=0;
13        for(int i=0;i<nums.length;i++)
14        {
15           sum+=nums[i];
16           if(h.containsKey(sum))
17           {
18            max=Math.max(max,i-h.get(sum));
19           }
20           else{
21            h.put(sum,i);
22           }
23        }
24        return max;
25    }
26}