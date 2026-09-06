// Last updated: 9/6/2026, 6:10:26 PM
1class Solution {
2    public int maxProduct(int[] n) {
3        int max=n[0];
4        int min=n[0];
5        int res=n[0];
6        for(int i=1;i<n.length;i++)
7        {
8            if(n[i]<0)
9            {
10                int t=max;
11                max=min;
12                min=t;
13            }
14            max=Math.max(n[i],max*n[i]);
15            min=Math.min(n[i],min*n[i]);
16            res=Math.max(res,max);
17        }
18        return res;
19    }
20}