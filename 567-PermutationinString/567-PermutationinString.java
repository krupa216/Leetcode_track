// Last updated: 8/12/2026, 2:08:10 PM
1class Solution {
2    public boolean checkInclusion(String s1, String s2) {
3        int n=s1.length();
4        int m=s2.length();
5        if(n>m)
6        {
7            return false;
8        }
9        char[] c=s1.toCharArray();
10        Arrays.sort(c);
11        for(int i=0;i<=m-n;i++)
12        
13        {
14            String s=s2.substring(i,i+n);
15            char[] su=s.toCharArray();
16            Arrays.sort(su);
17            if(Arrays.equals(c,su))
18            
19            {
20                return true;
21            }
22        }
23        return false;
24    }
25}