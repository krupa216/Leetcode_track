// Last updated: 8/25/2026, 8:01:58 PM
1class Solution {
2    public int divisorSubstrings(int num, int k) {
3        String s=String.valueOf(num);
4        int c=0;
5        for(int i=0;i<=s.length()-k;i++)
6        {
7            String db=s.substring(i,i+k);
8            int n1=Integer.parseInt(db);
9            if(n1!=0 && num%n1==0)
10            {
11   c++;
12            }
13        }
14        return c;
15    }
16}