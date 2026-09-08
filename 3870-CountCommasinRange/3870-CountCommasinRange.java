// Last updated: 9/8/2026, 11:16:32 AM
1class Solution {
2    public int countCommas(int n) {
3       int c=0;
4       for(int i=1;i<=n;i++)
5       {
6        if(i>=1000)
7        {
8            c++;
9        }
10       }
11       return c;
12    }
13}