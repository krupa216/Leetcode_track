// Last updated: 9/15/2026, 11:40:51 AM
1class Solution {
2    public char repeatedCharacter(String s) {
3        int[] f=new int[26];
4        char ch='a';
5        for(int i=0;i<s.length();i++)
6        {
7              f[s.charAt(i)-'a']++;
8            if(f[s.charAt(i)-'a']==2)
9            {
10               ch=s.charAt(i);
11           break;
12            }
13          
14
15        }
16        return ch;
17    }
18}