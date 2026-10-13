// Last updated: 10/13/2026, 11:51:07 AM
1class Solution {
2    public String shortestPalindrome(String s) {
3       String st=new StringBuilder(s).reverse().toString();
4       for(int i=0;i<s.length();i++)
5       {
6        if(s.startsWith(st.substring(i)))
7        {
8            return st.substring(0,i)+s;
9        }
10       }
11        return s;
12    }
13}