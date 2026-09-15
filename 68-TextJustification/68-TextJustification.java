// Last updated: 9/15/2026, 11:29:20 AM
1class Solution {
2    public String orderlyQueue(String s, int k) {
3        if(k>1)
4        {
5        char[] ch=s.toCharArray();
6        Arrays.sort(ch);
7        return new String(ch);
8        }
9      String res=s;
10      for(int i=1;i<s.length();i++)
11      {
12        String r=s.substring(i)+s.substring(0,i);
13        if(res.compareTo(r)>0)
14        {
15            res=r;
16        }
17      
18      }
19       return res;
20    }
21}