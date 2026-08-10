// Last updated: 8/10/2026, 11:42:25 AM
1class Solution {
2    public int partitionDisjoint(int[] a) {
3      int max=a[0];int ind=0;int smax=max;
4      for(int i=0;i<a.length;i++)
5      {
6      if(max>a[i])
7      {
8        max=smax;
9        ind=i;
10
11      }
12      else
13      {
14        smax=Math.max(smax,a[i]);
15      }
16      }
17        return ind+1;
18    }
19}