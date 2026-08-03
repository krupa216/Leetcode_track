// Last updated: 8/3/2026, 12:36:39 PM
1class Solution {
2    public int numSpecialEquivGroups(String[] words) {
3        HashSet<String> h=new HashSet<>();
4        for(String w:words)
5        {
6            String odd="";
7            String even="";
8            for(int i=0;i<w.length();i++)
9            {
10                if(i%2==0)
11                {
12                    even+=w.charAt(i);
13                }
14                else
15                {
16                    odd+=w.charAt(i);
17                }
18            }
19            char[] c1=odd.toCharArray();
20              char[] c2=even.toCharArray();
21              Arrays.sort(c1);
22              Arrays.sort(c2);
23              h.add(new String(c1)+new String(c2));
24        }
25    return h.size();
26    }
27}