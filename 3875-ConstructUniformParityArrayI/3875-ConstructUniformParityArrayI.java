// Last updated: 9/2/2026, 11:43:04 AM
1class Solution {
2    public int maximumLengthSubstring(String s) {
3        int i=0;int j=0;int max=0;
4        int[] f=new int[26];
5        while(j<s.length())
6        {
7            char c=s.charAt(j);
8            f[c-'a']++;
9            while(f[c-'a']>2)
10            {
11                f[s.charAt(i)-'a']--;
12                i++;
13            }
14            j++;
15            max=Math.max(max,j-i);
16        }
17        return max;    }
18}