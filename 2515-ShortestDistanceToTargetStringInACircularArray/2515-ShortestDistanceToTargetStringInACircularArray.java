// Last updated: 9/6/2026, 4:24:37 PM
class Solution {
    public int closestTarget(String[] words, String target, int st) {
       int n=words.length;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++)
       {
        if(words[i].equals(target))
        {
            int j=Math.abs(st-i);
            int w=n-j;
            int res=Math.min(j,w);
            min=Math.min(min,res);
        }
       } 
       return min==Integer.MAX_VALUE?-1:min;
    }
}