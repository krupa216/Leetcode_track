// Last updated: 9/3/2026, 2:36:01 PM
1class Solution {
2    public int closestTarget(String[] words, String target, int st) {
3       int n=words.length;
4       int min=Integer.MAX_VALUE;
5       for(int i=0;i<n;i++)
6       {
7        if(words[i].equals(target))
8        {
9            int j=Math.abs(st-i);
10            int w=n-j;
11            int res=Math.min(j,w);
12            min=Math.min(min,res);
13        }
14       } 
15       return min==Integer.MAX_VALUE?-1:min;
16    }
17}