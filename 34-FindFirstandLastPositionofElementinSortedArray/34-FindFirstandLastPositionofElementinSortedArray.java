// Last updated: 7/31/2026, 11:46:20 AM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int i=0;
4        int j=0;
5        while(i<s.length() && j<t.length())
6        {
7            if(s.charAt(i)==t.charAt(j))
8            {
9                i++;
10            }
11            j++;
12        }
13        return i==s.length();
14    }
15}