// Last updated: 9/8/2026, 3:09:47 PM
1class Solution {
2    public int[] singleNumber(int[] nums) {
3        HashMap<Integer,Integer> h=new HashMap<>();
4        for(int i=0;i<nums.length;i++)
5        {
6            h.put(nums[i],h.getOrDefault(nums[i],0)+1);
7        } 
8        List<Integer> l=new LinkedList<>();
9        int[] f=new int[2];
10        for(Map.Entry<Integer,Integer> j:h.entrySet())
11        {
12            if(j.getValue()==1)
13            {
14                l.add(j.getKey());
15            }
16        }
17        int p=0;
18        for(int i:l)
19        {
20            f[p]=i;
21            p++;
22        }
23        return f;
24    }
25}