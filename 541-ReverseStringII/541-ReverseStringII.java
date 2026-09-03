// Last updated: 9/3/2026, 9:39:10 PM
1class Solution {
2    public String reverseWords(String s) {
3        String[] st=s.split(" ");
4        String t="";
5        for(int i=0;i<st.length;i++)
6        {
7            StringBuilder sb=new StringBuilder(st[i]);
8            t+=sb.reverse();
9            if(i<st.length-1)
10            {
11                t+=" ";
12            }
13        }
14        return t;
15    }
16}