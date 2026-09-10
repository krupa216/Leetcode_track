// Last updated: 9/10/2026, 8:47:15 PM
1class Solution {
2    public String longestPalindrome(String s) {
3       int max=0;
4       int st=0;
5        for(int i=0;i<s.length();i++)
6        {
7            int r=i;
8            int l=i;
9            while(l>=0 && r<s.length()&& s.charAt(r)==s.charAt(l))
10            {
11                if(r-l+1>max)
12                {
13                    max=r-l+1;
14                    st=l;
15                }
16                l--;
17                r++;
18            }
19                r=i+1;
20            l=i;
21            while(l>=0 && r<s.length()&& s.charAt(r)==s.charAt(l))
22            {
23                if(r-l+1>max)
24                {
25                    max=r-l+1;
26                    st=l;
27                }
28                l--;
29                r++;
30            }
31        }
32    return s.substring(st,st+max);
33    }
34}