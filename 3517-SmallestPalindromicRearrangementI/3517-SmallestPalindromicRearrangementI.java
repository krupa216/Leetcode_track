// Last updated: 7/28/2026, 2:07:18 PM
1class Solution {
2    public String smallestPalindrome(String s) {
3        int[] f=new int[26];
4        for(int i=0;i<s.length();i++)
5        {
6            f[s.charAt(i)-'a']++;
7        }
8        String l="";
9        String m="";
10        for(int i=0;i<26;i++)
11        {
12            while(f[i]>=2)
13            {
14              l+=(char)(i+'a');
15              f[i]-=2;
16            }
17
18            if(f[i]==1)
19            {
20                m+=(char)(i+'a');
21            }
22        }
23        String r=new StringBuilder(l).reverse().toString();
24        return l+m+r;
25    }
26}