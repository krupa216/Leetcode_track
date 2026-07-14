// Last updated: 7/14/2026, 2:03:55 PM
class Solution {
    public int maxProfit(int[] p) {
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i=0;i<p.length;i++){
          if(p[i]<min)
          {
            min=p[i];
          }
          int pf=p[i]-min;
          if(pf>max)
          {
            max=pf;
          }
        }
        return max;
    }
}