// Last updated: 9/7/2026, 2:36:04 PM
1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        List<Integer> l=new ArrayList<>();
4        HashMap<Integer,Integer> h=new HashMap<>();
5        for(int i=0;i<nums.length;i++)
6        {
7            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
8        }
9        for(Map.Entry<Integer, Integer> j :h.entrySet())
10        {
11            if(j.getValue()>nums.length/3)
12            {
13                l.add(j.getKey());
14            }
15        }
16        return l;
17    }
18}