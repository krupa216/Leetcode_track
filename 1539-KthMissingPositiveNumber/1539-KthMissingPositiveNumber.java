// Last updated: 9/28/2026, 8:13:28 PM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        HashSet<Integer> h=new HashSet<>();
4        int max=0;
5        for(int i=0;i<arr.length;i++)
6        {
7            h.add(arr[i]);
8            max=Math.max(max,arr[i]);
9        }
10        List<Integer> a=new ArrayList<>();
11        
12        for(int i=1;i<=(max+k);i++)
13        {
14        
15            if(!h.contains(i))
16            {
17                a.add(i);
18            }
19           
20        }
21        System.out.print(a);
22        int b=a.get(k-1);
23        return b;
24    }
25}