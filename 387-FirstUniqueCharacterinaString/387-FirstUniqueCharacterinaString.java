// Last updated: 9/17/2026, 2:16:58 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] f=new int[26];
4        for(int i=0;i<s.length();i++)
5        {
6            f[s.charAt(i)-'a']++;
7        }
8        for(int i=0;i<s.length();i++)
9        {
10            if(f[s.charAt(i)-'a']==1)
11            {
12                return i;
13            }
14        }
15        return -1;
16    }
17}