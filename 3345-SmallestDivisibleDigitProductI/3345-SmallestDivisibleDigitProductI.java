// Last updated: 8/16/2026, 4:45:56 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max=0;int smax=0;
4        int m=n;
5        while(m>0)
6        {
7            int d=m%10;
8            if(d>max)
9            {
10                smax=max;
11                max=d;
12            }
13       
14           else if(d>smax)
15            {
16                smax=d;
17            }
18            m/=10;
19        }
20        return max*smax;
21    }
22}