// Last updated: 9/6/2026, 4:27:18 PM
class Solution {
    public int partitionDisjoint(int[] a) {
      int max=a[0];int ind=0;int smax=max;
      for(int i=0;i<a.length;i++)
      {
      if(max>a[i])
      {
        max=smax;
        ind=i;

      }
      else
      {
        smax=Math.max(smax,a[i]);
      }
      }
        return ind+1;
    }
}