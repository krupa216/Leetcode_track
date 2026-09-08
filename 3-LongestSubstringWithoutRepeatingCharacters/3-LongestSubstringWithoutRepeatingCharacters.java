// Last updated: 9/8/2026, 3:12:49 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3         String l="";
4      String cu="";
5
6      for(int i=0;i<s.length();i++)
7      {
8        if(cu.contains(String.valueOf(s.charAt(i))))
9        {
10           int index=cu.indexOf(s.charAt(i));
11           cu=cu.substring(index+1);
12        }
13        cu=cu+s.charAt(i);
14        if(cu.length()>l.length())
15        {
16            l=cu;
17        }
18      }
19      int c=l.length();
20      return c;
21    
22    }
23}