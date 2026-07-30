// Last updated: 7/30/2026, 12:17:49 PM
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        String s="";
4        while(a>0 || b>0)
5        {
6       
7         if(s.endsWith("aa"))
8        {
9               s+="b";
10               b--;
11        }
12        else if(s.endsWith("bb"))
13        {
14            s+="a";
15            a--;
16        }
17        else if(a>b)
18        {
19            s+="a";
20            a--;
21        }
22        else
23        {
24         s+="b";
25         b--;
26        }
27        }
28    return s;
29    }
30}