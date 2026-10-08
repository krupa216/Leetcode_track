// Last updated: 10/8/2026, 10:02:43 AM
1class Solution {
2    public int reverseDegree(String s) {
3        int[] f=new int[26];
4        int a=26;
5        for(int i=0;i<s.length();i++)
6        {
7            f[s.charAt(i)-'a']++;
8        }
9        int sum=0;
10        for(int i=0;i<s.length();i++)
11        {
12           sum+=(a-(s.charAt(i)-'a'))*(i+1);
13          
14        }
15        return sum;
16    }
17}