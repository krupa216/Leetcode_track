// Last updated: 9/1/2026, 11:38:37 AM
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3        HashMap<Integer,HashSet<Integer>> h=new HashMap<>();
4        for(int[] a:logs)
5        {
6            int u=a[0];
7            int v=a[1];
8            if(!h.containsKey(u)){
9                h.put(u,new HashSet<>());
10                h.get(u).add(v);
11            }
12            else
13            {
14                h.get(u).add(v);
15            }
16        }
17        int[] ans=new int[k];
18        for(int a:h.keySet())
19        {
20            HashSet<Integer> b=h.get(a);
21            ans[b.size()-1]++;
22        }
23        return ans;
24    }
25}