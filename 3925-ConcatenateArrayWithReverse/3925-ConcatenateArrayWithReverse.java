// Last updated: 9/6/2026, 4:23:24 PM
class Solution {
    public int[] concatWithReverse(int[] n) {
        int[] a=new int[n.length*2];
        int t=0;
        for(int i=0;i<n.length;i++)
        {
            a[i]=n[i];
            t++;
        }
        for(int i=n.length-1;i>=0;i--)
        {
            a[t]=n[i];
            t++;
        }
        return a;
    }
}