// Last updated: 8/4/2026, 11:37:11 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        ArrayList<Integer> a=new ArrayList<>();
4        HashSet<Integer> h=new HashSet<>();
5        int max=0;
6        int min=nums[0];
7        for(int j:nums)
8        {
9            max=Math.max(max,j);
10            min=Math.min(min,j);
11            h.add(j);
12        }
13        for(int i=min+1;i<max;i++)
14        {
15           if(!h.contains(i))
16           {
17                a.add(i);
18           }
19        }
20        return a;
21    }
22}