// Last updated: 9/25/2026, 4:05:04 PM
1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        boolean b=false;
4        for(int i=0;Math.pow(2,i)<=n;i++)
5        {
6            if(Math.pow(2,i)==n)
7            {
8                return true;
9                
10            }
11        }
12        return b;
13    }
14}