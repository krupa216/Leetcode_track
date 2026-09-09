// Last updated: 9/9/2026, 11:55:50 AM
1class Solution {
2    public long countCommas(long n) {
3        long c=0;
4        if(n<1000)
5        {
6            return c;
7        }
8        long s=1000;
9        while(s<=n)
10        {
11            c+=n-s+1;
12            s*=1000;
13        }
14        return c;
15
16    }
17}