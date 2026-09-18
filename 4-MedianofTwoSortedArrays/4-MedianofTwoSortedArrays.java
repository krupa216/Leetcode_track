// Last updated: 9/18/2026, 4:37:02 PM
1class Solution {
2    public String mergeAlternately(String w1, String w2) {
3        int i=0;
4        int j=0;
5        String r="";
6        while(i<w1.length()||j<w2.length())
7        {
8            if(i<w1.length())
9            {
10            r+=w1.charAt(i);
11            i++;
12            }
13            if(j<w2.length())
14            {
15             r+=w2.charAt(j);
16             j++;
17            }
18        }
19
20        
21        return r;
22    }
23}