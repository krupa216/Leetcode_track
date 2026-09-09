// Last updated: 9/9/2026, 4:13:49 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        HashSet<Character> h=new HashSet<>();
4        int j=0;
5        int max=0;
6
7      for(int i=0;i<s.length();i++)
8      {
9       while(h.contains(s.charAt(i)))
10        {
11            h.remove(s.charAt(j));
12           j++;
13        }
14       h.add(s.charAt(i));
15
16       max=Math.max(max,i-j+1);
17       
18      }
19     
20      return max;
21    
22    }
23}